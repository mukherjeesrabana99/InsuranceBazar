/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exavalu.services;

import com.exavalu.models.Claim;
import com.exavalu.utils.JDBCConnectionManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/**
 *
 * @author LENOVO
 */
public class InsuranceOfficerService {

    public ArrayList getAllApprovedHealthClaims() {
        ArrayList approvedHealthPolicyList = new ArrayList();
        try {
            Connection con = JDBCConnectionManager.getConnection();
            String sql = "select * from claims c,users u,categories ca,policies p where c.userId=u.userId and c.categoryId=ca.categoryId and c.policyId=p.policyId and claimStatus=? and categoryId=?";

            PreparedStatement preparedStatement = con.prepareStatement(sql);
            //claim status 2 means status approved by underwriter
            preparedStatement.setString(1, "2");
            preparedStatement.setString(2, "1");
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Claim claim = new Claim();
                claim.setClaimId(rs.getString("claimId"));
                claim.setClaimExpiryDate(rs.getString("claimExpiryDate"));
                claim.setClaimStatus(rs.getString("claimStatus"));
                claim.setClaimName(rs.getString("claimName"));

                claim.setFullName(rs.getString("fullName"));
                claim.setEmail(rs.getString("email"));

                claim.setCategoryName(rs.getString("categoryName"));

                claim.setPolicyName(rs.getString("policyName"));
                claim.setPolicyDescription(rs.getString("policyDescription"));

                claim.setMedicalHistory(rs.getString("medicalHistory"));
                claim.setDob(rs.getString("dob"));
                claim.setRelation(rs.getString("relation"));
                claim.setRelativeName(rs.getString("relativeName"));

//                System.out.println(claim.getClaimId());
//                 System.out.println(claim.getClaimStatus());
//                  System.out.println(claim.getDriverName());
//                   System.out.println(claim.getEmailAddress());
//                    System.out.println(claim.getDate());
                approvedHealthPolicyList.add(claim);

            }

        } catch (SQLException ex) {
            Logger log = Logger.getLogger(UnderwriterService.class.getName());
            log.error(LocalDateTime.now() + "@" + ex);
            ex.printStackTrace();
        }
        //System.out.println("Number of pending list = " + pendingHealthPolicyList.size());
        return approvedHealthPolicyList;
    }

    public ArrayList getAllApprovedCarClaims() {
        ArrayList approvedCarPolicyList = new ArrayList();
        try {
            Connection con = JDBCConnectionManager.getConnection();
            String sql = "select * from claims c,users u,categories ca,policies p where c.userId=u.userId and c.categoryId=ca.categoryId and c.policyId=p.policyId and claimStatus=? and categoryId=?";

            PreparedStatement preparedStatement = con.prepareStatement(sql);

            preparedStatement.setString(1, "2");
            preparedStatement.setString(2, "2");
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Claim claim = new Claim();
                claim.setClaimId(rs.getString("claimId"));
                claim.setClaimExpiryDate(rs.getString("claimExpiryDate"));
                claim.setClaimStatus(rs.getString("claimStatus"));
                claim.setClaimName(rs.getString("claimName"));

                claim.setFullName(rs.getString("fullName"));
                claim.setEmail(rs.getString("email"));

                claim.setCategoryName(rs.getString("categoryName"));

                claim.setPolicyName(rs.getString("policyName"));
                claim.setPolicyDescription(rs.getString("policyDescription"));

                claim.setIncidentDate(rs.getString("incidentDate"));
                claim.setIncidentLocation(rs.getString("incidentLocatin"));
                claim.setPoliceReportNo(rs.getString("policeReportNo"));
                claim.setCarModel(rs.getString("carModel"));
                claim.setCarNo(rs.getString("carNo"));
                claim.setCarRegistrationYear(rs.getString("carRegistrationYear"));

//                System.out.println(claim.getClaimId());
//                 System.out.println(claim.getClaimStatus());
//                  System.out.println(claim.getDriverName());
//                   System.out.println(claim.getEmailAddress());
//                    System.out.println(claim.getDate());
                approvedCarPolicyList.add(claim);

            }

        } catch (SQLException ex) {
            Logger log = Logger.getLogger(UnderwriterService.class.getName());
            log.error(LocalDateTime.now() + "@" + ex);
            ex.printStackTrace();
        }
        //System.out.println("Number of pending list = " + pendingLifePolicyList.size());
        return approvedCarPolicyList;
    }

    public ArrayList getAllApprovedTermClaims() {
        ArrayList approvedTermPolicyList = new ArrayList();
        try {
            Connection con = JDBCConnectionManager.getConnection();
            String sql = "select * from claims c,users u,categories ca,policies p where c.userId=u.userId and c.categoryId=ca.categoryId and c.policyId=p.policyId and claimStatus=? and categoryId=?";

            PreparedStatement preparedStatement = con.prepareStatement(sql);

            preparedStatement.setString(1, "2");
            preparedStatement.setString(2, "3");
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Claim claim = new Claim();
                claim.setClaimId(rs.getString("claimId"));
                claim.setClaimExpiryDate(rs.getString("claimExpiryDate"));
                claim.setClaimStatus(rs.getString("claimStatus"));
                claim.setClaimName(rs.getString("claimName"));

                claim.setFullName(rs.getString("fullName"));
                claim.setEmail(rs.getString("email"));

                claim.setCategoryName(rs.getString("categoryName"));

                claim.setPolicyName(rs.getString("policyName"));
                claim.setPolicyDescription(rs.getString("policyDescription"));

                claim.setChildName(rs.getString("childName"));
                claim.setDob(rs.getString("dob"));

//                System.out.println(claim.getClaimId());
//                 System.out.println(claim.getClaimStatus());
//                  System.out.println(claim.getDriverName());
//                   System.out.println(claim.getEmailAddress());
//                    System.out.println(claim.getDate());
                approvedTermPolicyList.add(claim);

            }

        } catch (SQLException ex) {
            Logger log = Logger.getLogger(UnderwriterService.class.getName());
            log.error(LocalDateTime.now() + "@" + ex);
            ex.printStackTrace();
        }
        //System.out.println("Number of pending list = " + pendingLifePolicyList.size());
        return approvedTermPolicyList;
    }

    public ArrayList getAllApprovedInvestmentClaims() {
        ArrayList approvedInvestmentPolicyList = new ArrayList();
        try {
            Connection con = JDBCConnectionManager.getConnection();
            String sql = "select * from claims c,users u,categories ca,policies p where c.userId=u.userId and c.categoryId=ca.categoryId and c.policyId=p.policyId and claimStatus=? and categoryId=?";

            PreparedStatement preparedStatement = con.prepareStatement(sql);

            preparedStatement.setString(1, "2");
            preparedStatement.setString(2, "4");
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Claim claim = new Claim();
                claim.setClaimId(rs.getString("claimId"));
                claim.setClaimExpiryDate(rs.getString("claimExpiryDate"));
                claim.setClaimStatus(rs.getString("claimStatus"));
                claim.setClaimName(rs.getString("claimName"));

                claim.setFullName(rs.getString("fullName"));
                claim.setEmail(rs.getString("email"));

                claim.setCategoryName(rs.getString("categoryName"));

                claim.setPolicyName(rs.getString("policyName"));
                claim.setPolicyDescription(rs.getString("policyDescription"));

                claim.setOccupation(rs.getString("occupation"));
                claim.setAnnualIncome(rs.getString("annualIncome"));

//                System.out.println(claim.getClaimId());
//                 System.out.println(claim.getClaimStatus());
//                  System.out.println(claim.getDriverName());
//                   System.out.println(claim.getEmailAddress());
//                    System.out.println(claim.getDate());
                approvedInvestmentPolicyList.add(claim);

            }

        } catch (SQLException ex) {
            Logger log = Logger.getLogger(UnderwriterService.class.getName());
            log.error(LocalDateTime.now() + "@" + ex);
            ex.printStackTrace();
        }
        //System.out.println("Number of pending list = " + pendingLifePolicyList.size());
        return approvedInvestmentPolicyList;
    }

    public ArrayList getAllApprovedOtherClaims() {
        ArrayList approvedOtherPolicyList = new ArrayList();
        try {
            Connection con = JDBCConnectionManager.getConnection();
            String sql = "select * from claims c,users u,categories ca,policies p where c.userId=u.userId and c.categoryId=ca.categoryId and c.policyId=p.policyId and claimStatus=? and categoryId=?";

            PreparedStatement preparedStatement = con.prepareStatement(sql);

            preparedStatement.setString(1, "2");
            preparedStatement.setString(2, "5");
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Claim claim = new Claim();
                claim.setClaimId(rs.getString("claimId"));
                claim.setClaimExpiryDate(rs.getString("claimExpiryDate"));
                claim.setClaimStatus(rs.getString("claimStatus"));
                claim.setClaimName(rs.getString("claimName"));

                claim.setFullName(rs.getString("fullName"));
                claim.setEmail(rs.getString("email"));

                claim.setCategoryName(rs.getString("categoryName"));

                claim.setPolicyName(rs.getString("policyName"));
                claim.setPolicyDescription(rs.getString("policyDescription"));

                claim.setEducationLevel(rs.getString("educationLevel"));

                claim.setTravelEndDate(rs.getString("travelEndDate"));
                claim.setTravelStartDate(rs.getString("travelStartDate"));
                claim.setTravelDestination(rs.getString("travelDestination"));
                claim.setNoOfTravelMembers(rs.getString("noOfTravelMembers"));

//                System.out.println(claim.getClaimId());
//                 System.out.println(claim.getClaimStatus());
//                  System.out.println(claim.getDriverName());
//                   System.out.println(claim.getEmailAddress());
//                    System.out.println(claim.getDate());
                approvedOtherPolicyList.add(claim);

            }

        } catch (SQLException ex) {
            Logger log = Logger.getLogger(UnderwriterService.class.getName());
            log.error(LocalDateTime.now() + "@" + ex);
            ex.printStackTrace();
        }
        //System.out.println("Number of pending list = " + pendingLifePolicyList.size());
        return approvedOtherPolicyList;
    }

    public boolean sanctionPolicy(String claimId) {
        boolean result = true;
        try {
            Connection con = JDBCConnectionManager.getConnection();
            String sql = "UPDATE insurancebazar.claims\n"
                    + "SET claimStatus = ? where claimId=?";

            PreparedStatement preparedStatement = con.prepareStatement(sql);
            //status 3 = sanctioned by the io
            preparedStatement.setString(1, "3");
            preparedStatement.setString(2, claimId);

//            System.out.println("sql="+preparedStatement);
            int row = preparedStatement.executeUpdate();

            if (row == 1) {
                result = true;
            }

        } catch (SQLException ex) {
            Logger log = Logger.getLogger(InsuranceOfficerService.class.getName());
            log.error(LocalDateTime.now() + "@" + ex);
            ex.printStackTrace();
        }
        return result;

    }
}
