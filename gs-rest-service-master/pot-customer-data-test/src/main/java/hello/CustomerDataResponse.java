package hello;

public class CustomerDataResponse {

    private String canon;            // Initially null; set by getUncPath; dir must end with '/'
    private String share;            // Can be null
    private long createTime;
    private long lastModified;
    private long size;

    public CustomerDataResponse(){
    	
    }

    public CustomerDataResponse(String canon, String share, long createTime,
			long lastModified, long size) {
		this.canon = canon;
		this.share = share;
		this.createTime = createTime;
		this.lastModified = lastModified;
		this.size = size;
	}
    
    public CustomerDataResponse(CustomerDataResponse other){
		this.canon = other.canon;
		this.share = other.share;
		this.createTime = other.createTime;
		this.lastModified = other.lastModified;
		this.size = other.size;
    }

    public String getCanon() {
        return canon;
    }

    public void setCanon(String canon) {
        this.canon = canon;
    }

    public String getShare() {
        return share;
    }

    public void setShare(String share) {
        this.share = share;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public long getLastModified() {
        return lastModified;
    }

    public void setLastModified(long lastModified) {
        this.lastModified = lastModified;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

}
