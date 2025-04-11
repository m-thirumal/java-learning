package in.thirumal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CrushFtpFolderCreator {

	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/icms";
        String user = "postgres";
        String password = "thirumal";
        String query = "SELECT CONCAT(debtor_name.rest_of_name, '#', c.insolvency_case_uid) AS debtor_name, subscriber_mail.user_id " +
                "FROM indsolv.insolvency_case AS c " +
                "LEFT JOIN indsolv.party_party_relationship AS ppr ON ppr.insolvency_case_uid = c.insolvency_case_uid " +
                "LEFT JOIN indsolv.party_role AS debtor ON debtor.party_role_uid = ppr.party_role_uid " +
                "LEFT JOIN indsolv.party_role AS subscriber ON subscriber.party_role_uid = ppr.party_role_uid_related " +
                "LEFT JOIN indsolv.party_name AS debtor_name ON debtor_name.party_uid = debtor.party_uid AND debtor_name.end_date IS NULL " +
                "LEFT JOIN indsolv.party_name AS subscriber_name ON subscriber_name.party_uid = subscriber.party_uid AND subscriber_name.end_date IS NULL " +
                "LEFT JOIN indsolv.login_user AS subscriber_mail ON subscriber_mail.party_uid = subscriber.party_uid " +
                "WHERE ppr.party_relationship_type_cd = 7 AND ppr.end_date IS NULL";

      
        try (Connection conn = DriverManager.getConnection(url, user, password);
                PreparedStatement pstmt = conn.prepareStatement(query);
                ResultSet rs = pstmt.executeQuery()) {

               while (rs.next()) {
                   createFolder(rs.getString("debtor_name"), rs.getString("user_id"));
                   System.out.println("--------------------------------");
               }
           } catch (SQLException e) {
               e.printStackTrace();
           }
		//
		
	}
	
	static void createFolder(String caseName, String email) {
		System.out.println("cd " + email);
		String caseNameForFolder = "\"" + caseName + "\"";
		System.out.println("mkdir " + caseNameForFolder);
		System.out.println("cd " + caseNameForFolder);
		System.out.println("aws s3 sync \"s3://icms-ap-south-1-backup/icms-1-backup/" + caseName + "\" .");
		System.out.println("cd ../../");
	}
	
	/**
	 * select l.user_id, CONCAT( pn.first_name, ' ', pn.surname, CASE WHEN pn.rest_of_name IS NOT NULL AND pn.rest_of_name <> '' 
         THEN pn.rest_of_name 
         ELSE '' 
    END, '#', ppr.party_party_relationship_uid) AS Name from indsolv.party_party_relationship AS ppr
LEFT JOIN indsolv.party_role AS pr ON pr.party_role_uid = ppr.party_role_uid_related 
LEFT JOIN indsolv.party_name AS pn ON pn.party_uid = pr.party_uid AND pn.end_date IS NULL
LEFT JOIN indsolv.login_user AS l ON l.party_uid = pr.party_uid
where ppr.party_relationship_type_cd = 1 AND ppr.end_date IS NULL ORDER BY user_id
	 */

}
