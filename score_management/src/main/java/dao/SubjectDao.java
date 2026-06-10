package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.security.auth.Subject;

public class SubjectDAO extends DAO {

    // 科目一覧取得
    public List<Subject> selectAll() throws Exception {

        List<Subject> list = new ArrayList<>();

        Connection con = getConnection();

        PreparedStatement st =
                con.prepareStatement(
                    "SELECT * FROM SUBJECT ORDER BY CD"
                );

        ResultSet rs = st.executeQuery();

        while (rs.next()) {

            Subject subject = new Subject();

            subject.setSchoolCd(rs.getString("SCHOOL_CD"));
            subject.setCd(rs.getString("CD"));
            subject.setName(rs.getString("NAME"));

            list.add(subject);
        }

        rs.close();
        st.close();
        con.close();

        return list;
    }

    // 科目コード検索
    public Subject search(String cd) throws Exception {

        Subject subject = null;

        Connection con = getConnection();

        PreparedStatement st =
                con.prepareStatement(
                    "SELECT * FROM SUBJECT WHERE CD=?"
                );

        st.setString(1, cd);

        ResultSet rs = st.executeQuery();

        if (rs.next()) {

            subject = new Subject();

            subject.setSchoolCd(rs.getString("SCHOOL_CD"));
            subject.setCd(rs.getString("CD"));
            subject.setName(rs.getString("NAME"));
        }

        rs.close();
        st.close();
        con.close();

        return subject;
    }

    // 科目登録
    public int insert(Subject subject) throws Exception {

        Connection con = getConnection();

        PreparedStatement st =
                con.prepareStatement(
                    "INSERT INTO SUBJECT " +
                    "(SCHOOL_CD, CD, NAME) " +
                    "VALUES (?, ?, ?)"
                );

        st.setString(1, subject.getSchoolCd());
        st.setString(2, subject.getCd());
        st.setString(3, subject.getName());

        int count = st.executeUpdate();

        st.close();
        con.close();

        return count;
    }

    // 科目更新
    public int update(Subject subject) throws Exception {

        Connection con = getConnection();

        PreparedStatement st =
                con.prepareStatement(
                    "UPDATE SUBJECT " +
                    "SET NAME=? " +
                    "WHERE SCHOOL_CD=? AND CD=?"
                );

        st.setString(1, subject.getName());
        st.setString(2, subject.getSchoolCd());
        st.setString(3, subject.getCd());

        int count = st.executeUpdate();

        st.close();
        con.close();

        return count;
    }

    // 科目削除
    public int delete(String schoolCd, String cd)
            throws Exception {

        Connection con = getConnection();

        PreparedStatement st =
                con.prepareStatement(
                    "DELETE FROM SUBJECT " +
                    "WHERE SCHOOL_CD=? AND CD=?"
                );

        st.setString(1, schoolCd);
        st.setString(2, cd);

        int count = st.executeUpdate();

        st.close();
        con.close();

        return count;
    }
}