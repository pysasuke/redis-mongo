package mongoModel;

/**
 * Created by DavidWang on 16/9/14.
 */
public class friend {

    private Long id;
    private int im_id;
    private String phone;

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
}
