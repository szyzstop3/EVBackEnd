package vo;

public class Comment {
    private int commentid;
    private int userid;
    private int chargerid;
    private String comment;
    private float stars;
    private String time;
    private float pay;
    private float reduction;
    private String payoption;

    public String getPayoption() {
        return payoption;
    }

    public void setPayoption(String payoption) {
        this.payoption = payoption;
    }

    public int getCommentid() {
        return commentid;
    }

    public void setCommentid(int commentid) {
        this.commentid = commentid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getChargerid() {
        return chargerid;
    }

    public void setChargerid(int chargerid) {
        this.chargerid = chargerid;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public float getStars() {
        return stars;
    }

    public void setStars(float stars) {
        this.stars = stars;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public float getPay() {
        return pay;
    }

    public void setPay(float pay) {
        this.pay = pay;
    }

    public float getReduction() {
        return reduction;
    }

    public void setReduction(float reduction) {
        this.reduction = reduction;
    }
}
