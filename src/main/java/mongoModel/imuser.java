package mongoModel;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;

/**
 * Created by DavidWang on 16/9/14.
 */
public class imuser {

    @Id
    private ObjectId _id;

//    @Field
    private Long id;

    private String nikeName;

    private  Long jobId;

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    private String picture;
    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    private Integer departid;

    public Integer getDepartid() {
        return departid;
    }

    public void setDepartid(Integer departid) {
        this.departid = departid;
    }

    public String getNikeName() {
        return nikeName;
    }

    public void setNikeName(String nikeName) {
        this.nikeName = nikeName;
    }



    private int im_id;

    private String phone;

    private ArrayList<friend> friends = new ArrayList<friend>();

    private ArrayList<newfriend> newfriends = new ArrayList<newfriend>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getIm_id() {
        return im_id;
    }

    public void setIm_id(int im_id) {
        this.im_id = im_id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<friend> getFriends() {
        return friends;
    }

    public void setFriends(ArrayList<friend> friends) {
        this.friends = friends;
    }

    public ArrayList<newfriend> getNewfriends() {
        return newfriends;
    }

    public void setNewfriends(ArrayList<newfriend> newfriends) {
        this.newfriends = newfriends;
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }
}
