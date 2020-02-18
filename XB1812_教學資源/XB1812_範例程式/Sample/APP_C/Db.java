import java.sql.*;
public class Db{
	public static void main(String args[]){
		Connection con=null;
		try{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
			String strConn="jdbc:sqlserver://localhost:1433;database=school";					con= DriverManager.getConnection(strConn,"demo","demo");
			Statement st = con.createStatement();
			String sql="select * from article";  //設定欲執行的SQL敘述內容
			System.out.println("sql="+sql);  //顯示SQL敘述內容於畫面

			ResultSet rs = st.executeQuery(sql);
			int nCnt=0;
			while (rs.next() ){
				nCnt++;
				System.out.println("id="+rs.getString("id")+
				"-"+rs.getString("name")+"(價格:$"+rs.getString("price")+
				",庫存量:"+rs.getString("inventory")+")");
			}
			System.out.println("總共查得筆數："+nCnt);
			rs.close();
			st.close();
			con.close();
		}catch(Exception e){
			System.out.println("Database can\'t connection!!");
			System.out.println(e.getMessage());
		}
	}
}
