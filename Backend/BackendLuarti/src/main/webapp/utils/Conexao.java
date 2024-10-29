package Backend.BackendLuarti.src.main.webapp.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

    public class Conexao {
        public static Connection conectar() throws ClassNotFoundException {
            Connection con = null;
            String url = "jdbc:mysql://localhost:3306/luarti";
            String user = "admin";
            String password = "admin";
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(url, user, password);
                System.out.println("Conexão bem sucedida")

            } catch (SQLException ex)

            {
                System.out.println("Erro ao conectar com o banco " + ex);

            }
            return con;

        }
}
