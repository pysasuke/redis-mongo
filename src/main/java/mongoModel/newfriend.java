package mongoModel;

/**
 * Created by DavidWang on 16/9/14.
 */
public class newfriend {

    private Long targetid;

    private int status; //0待添加  1待接受

    public Long getTargetid() {
        return targetid;
    }

    public void setTargetid(Long targetid) {
        this.targetid = targetid;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
