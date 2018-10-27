package com.rbd.cloudcollect.domain;


import javax.persistence.*;

/**
 *用户信息表
 *
 * */
@Entity
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false,unique = true)
    private String userName;
    @Column(nullable = false)
    private String passWord;
    @Column(nullable = false,unique = true)
    private String email;
    @Column(nullable = true)
    private String profilePicture;
    @Column(nullable = true,length = 65535,columnDefinition = "Text")
    private String introduction;
    @Column(nullable = false)
    private Long createTime;
    @Column(nullable = false)
    private Long lastModifyTime;
    @Column(nullable = false)
    private String outDate;
    @Column(nullable = true)
    private String validataCode;
    @Column(nullable = true)
    private String backgroundPickure;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Long lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public String getOutDate() {
        return outDate;
    }

    public void setOutDate(String outDate) {
        this.outDate = outDate;
    }

    public String getValidataCode() {
        return validataCode;
    }

    public void setValidataCode(String validataCode) {
        this.validataCode = validataCode;
    }

    public String getBackgroundPickure() {
        return backgroundPickure;
    }

    public void setBackgroundPickure(String backgroundPickure) {
        this.backgroundPickure = backgroundPickure;
    }

    public User() {
        super();
    }
    public User(String email, String nickName, String passWord, String userName) {
        super();
        this.email = email;
        this.passWord = passWord;
        this.userName = userName;
    }
}
