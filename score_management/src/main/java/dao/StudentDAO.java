package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Student;

public class StudentDAO extends DAO {

    public List<Student> selectAll() throws Exception {

        List<Student> list = new ArrayList<>();

        Connection con = getConnection();

        PreparedStatement st =
                con.prepareStatement(
                    "SELECT * FROM STUDENT ORDER BY NO"
                );

        ResultSet rs = st.executeQuery();

        while (rs.next()) {

            Student s = new Student();

            s.setNo(rs.getString("NO"));
            s.setName(rs.getString("NAME"));
            s.setEntYear(rs.getInt("ENT_YEAR"));
            s.setClassNum(rs.getString("CLASS_NUM"));
            s.setAttend(rs.getBoolean("IS_ATTEND"));
            s.setSchoolCd(rs.getString("SCHOOL_CD"));

            list.add(s);
        }

        rs.close();
        st.close();
        con.close();

        return list;
    }