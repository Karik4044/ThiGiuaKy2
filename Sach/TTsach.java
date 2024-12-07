package Sach;

public class TTsach {
    private String id;
    private String tensach;
    private String tentacgia;
    private String tensx;

    //Constructor
    public TTsach(String id, String tensach, String tentacgia, String tensx) {
        this.id = id;
        this.tensach = tensach;
        this.tentacgia = tentacgia;
        this.tensx = tensx;
    }

    //Setter && Getter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public String getTentacgia() {
        return tentacgia;
    }

    public void setTentacgia(String tentacgia) {
        this.tentacgia = tentacgia;
    }

    public String getTensx() {
        return tensx;
    }

    public void setTensx(String tensx) {
        this.tensx = tensx;
    }

    //toString
    @Override
    public String toString() {
        return "TTsach{" +
                "id='" + id + '\'' +
                ", tensach='" + tensach + '\'' +
                ", tentacgia='" + tentacgia + '\'' +
                ", tensx='" + tensx + '\'' +
                '}';
    }
}
