import java.sql.*;
public class Db{
	public static void main(String args[]){
		Connection con=null;
		try{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
			String strConn="jdbc:sqlserver://localhost:1433;database=school";					con= DriverManager.getConnection(strConn,"demo","demo");
			Statement st = con.createStatement();
			String sql="select * from article";  //�]�w�����檺SQL�ԭz���e
			System.out.println("sql="+sql);  //���SQL�ԭz���e��e��

			ResultSet rs = st.executeQuery(sql);
			int nCnt=0;
			while (rs.next() ){
				nCnt++;
				System.out.println("id="+rs.getString("id")+
				"-"+rs.getString("name")+"(����:$"+rs.getString("price")+
				",�w�s�q:"+rs.getString("inventory")+")");
			}
			System.out.println("�`�@�d�o���ơG"+nCnt);
			rs.close();
			st.close();
			con.close();
		}catch(Exception e){
			System.out.println("Database can\'t connection!!");
			System.out.println(e.getMessage());
		}
	}
}
