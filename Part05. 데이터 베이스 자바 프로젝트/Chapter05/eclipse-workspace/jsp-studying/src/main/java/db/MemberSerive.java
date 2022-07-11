package db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MemberSerive {

    public List<Member> list() {
    	List<Member> memberList = new ArrayList<>();
        // 5개
        // 1. ip(domain)
        // 2. port
        // 3. 계정
        // 4. 패스워드
        // 5. 인스턴스
    	
        String url = "jdbc:mariadb://3.37.234.118:3306/testdb3";
        String dbUserId = "testuser3";
        String dbPassword = "zerobase";

        // 1. 드라이브 로드
        // 2. 커넥션 객체 생성
        // 3. 스테이트먼트 객체 생성
        // 4. 쿼리 실행
        // 5. 결과 수행
        // 6. 객체 연결 해제(close)

        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        //Statement statement = null;
        ResultSet rs = null;

        // email, kakao, facebook
        // sql injection 공격!!

        String membertypeValue = "email";

        try {
            connection = DriverManager.getConnection(url, dbUserId, dbPassword);


            String sql = " select member_type ,user_id ,password ,name " +
                    " from member " +
                    " where member_type = ? ";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, membertypeValue);

            rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String memberType = rs.getString("member_type");
                String userId = rs.getString("user_id");
                String password = rs.getString("password");
                String name = rs.getString("name");
                
                Member member = new Member();
                member.setMemberType(membertypeValue);
                member.setUserId(userId);
                member.setPassword(password);
                member.setName(name);
                
                memberList.add(member);

                System.out.println(memberType + ", " + userId + ", " + password + ", " + name);


            }
        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            try {
                if (rs != null && !rs.isClosed()) {
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                if (preparedStatement != null && !preparedStatement.isClosed()) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                if (connection != null && !connection.isClosed()) {
                    connection.isClosed();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return memberList;
    }

    public Member detail(String memberType, String userId) {
    	Member member = null;
        // 5개
        // 1. ip(domain)
        // 2. port
        // 3. 계정
        // 4. 패스워드
        // 5. 인스턴스
    	
        String url = "jdbc:mariadb://3.37.234.118:3306/testdb3";
        String dbUserId = "testuser3";
        String dbPassword = "zerobase";

        // 1. 드라이브 로드
        // 2. 커넥션 객체 생성
        // 3. 스테이트먼트 객체 생성
        // 4. 쿼리 실행
        // 5. 결과 수행
        // 6. 객체 연결 해제(close)

        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        //Statement statement = null;
        ResultSet rs = null;

   

        try {
            connection = DriverManager.getConnection(url, dbUserId, dbPassword);


            String sql = " " 
            		+ " select m.member_type "
            		+ "	, m.user_id "
            		+ "	, m.password "
            		+ "	, m.name" 
            		+ "	, md.mobile_no "
            		+ "	, md.marketing_yn "
            		+ "	, md.register_date "
            		+ " from member m "
            		+ "	left join member_detail md on md.member_type =m.member_type and m.user_id = md.user_id " 
            		+ " where m.member_type = ? and m.user_id  = ? ";


            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, memberType);
            preparedStatement.setString(2, userId);

            rs = preparedStatement.executeQuery();

            if (rs.next()) {    
            	member = new Member();
            	
                member.setMemberType(rs.getString("member_type"));
                member.setUserId(rs.getString("user_id"));
                member.setPassword(rs.getString("password"));
                member.setName(rs.getString("name"));
                member.setMobileNo(rs.getString("mobile_no"));
                member.setMarketingYn(rs.getBoolean("marketing_yn"));
                member.setRegisterDate(rs.getDate("register_date"));
                        
            }
        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            try {
                if (rs != null && !rs.isClosed()) {
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                if (preparedStatement != null && !preparedStatement.isClosed()) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                if (connection != null && !connection.isClosed()) {
                    connection.isClosed();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        return member;
    }
    
    
    /**
     * 회원 가입 함수
     * @param member 회원정보
     */
    public void register(Member member) {
        // 5개
        // 1. ip(domain)
        // 2. port
        // 3. 계정
        // 4. 패스워드
        // 5. 인스턴스

        String url = "jdbc:mariadb://3.37.234.118:3306/testdb3";
        String dbUserId = "testuser3";
        String dbPassword = "zerobase";

        // 1. 드라이브 로드
        // 2. 커넥션 객체 생성
        // 3. 스테이트먼트 객체 생성
        // 4. 쿼리 실행
        // 5. 결과 수행
        // 6. 객체 연결 해제(close)

        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        //Statement statement = null;
        ResultSet rs = null;

        // email, kakao, facebook
        // sql injection 공격!!

        try {
            connection = DriverManager.getConnection(url, dbUserId, dbPassword);


            String sql = " insert into member (member_type ,user_id ,password ,name) " +
                    " values (?, ?, ?, ?); ";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, member.getMemberType());
            preparedStatement.setString(2, member.getUserId());
            preparedStatement.setString(3, member.getPassword());
            preparedStatement.setString(4, member.getName());

            int affected = preparedStatement.executeUpdate();

            if (affected > 0) {
                System.out.println("성공");
            } else {
                System.out.println("실패");
            }

        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            try {
                if (rs != null && !rs.isClosed()) {
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                if (preparedStatement != null && !preparedStatement.isClosed()) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                if (connection != null && !connection.isClosed()) {
                    connection.isClosed();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


    public void dbUpdate() {
        // 5개
        // 1. ip(domain)
        // 2. port
        // 3. 계정
        // 4. 패스워드
        // 5. 인스턴스

        String url = "jdbc:mariadb://3.37.234.118:3306/testdb3";
        String dbUserId = "testuser3";
        String dbPassword = "zerobase";

        // 1. 드라이브 로드
        // 2. 커넥션 객체 생성
        // 3. 스테이트먼트 객체 생성
        // 4. 쿼리 실행
        // 5. 결과 수행
        // 6. 객체 연결 해제(close)

        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        //Statement statement = null;
        ResultSet rs = null;

        // email, kakao, facebook
        // sql injection 공격!!

        String membertypeValue = "email";
        String userIdValue = "zerobase@naver.com";
        String passwordValue = "9999";
        try {
            connection = DriverManager.getConnection(url, dbUserId, dbPassword);


            String sql = " update member " +
                    " set password = ? " +
                    " where member_type = ? and user_id = ?  ";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, passwordValue);
            preparedStatement.setString(2, membertypeValue);
            preparedStatement.setString(3, userIdValue);


            int affected = preparedStatement.executeUpdate();

            if (affected > 0) {
                System.out.println("성공");
            } else {
                System.out.println("실패");
            }

        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            try {
                if (rs != null && !rs.isClosed()) {
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                if (preparedStatement != null && !preparedStatement.isClosed()) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                if (connection != null && !connection.isClosed()) {
                    connection.isClosed();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 회원 탈퇴 함수
     * @param member 회원정보(회원 타입, 화원 아이디)
     */
    public void withdraw(Member member) {
        // 5개
        // 1. ip(domain)
        // 2. port
        // 3. 계정
        // 4. 패스워드
        // 5. 인스턴스

        String url = "jdbc:mariadb://3.37.234.118:3306/testdb3";
        String dbUserId = "testuser3";
        String dbPassword = "zerobase";

        // 1. 드라이브 로드
        // 2. 커넥션 객체 생성
        // 3. 스테이트먼트 객체 생성
        // 4. 쿼리 실행
        // 5. 결과 수행
        // 6. 객체 연결 해제(close)

        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        //Statement statement = null;
        ResultSet rs = null;

        // email, kakao, facebook
        // sql injection 공격!!

        try {
            connection = DriverManager.getConnection(url, dbUserId, dbPassword);


            String sql = " delete from member " +
            " where member_type = ? and user_id = ? ";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, member.getMemberType());
            preparedStatement.setString(2, member.getUserId());


            int affected = preparedStatement.executeUpdate();

            if (affected > 0) {
                System.out.println("성공");
            } else {
                System.out.println("실패");
            }

        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            try {
                if (rs != null && !rs.isClosed()) {
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                if (preparedStatement != null && !preparedStatement.isClosed()) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                if (connection != null && !connection.isClosed()) {
                    connection.isClosed();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
