package advance.dev.model;

public class KySu extends CanBo{
	private String nganh;

	public KySu(String ten, int tuoi, String gioiTinh, String diaChi, String nganh) {
		super(ten, tuoi, gioiTinh, diaChi);
		this.nganh = nganh;
	}

	public String getNganh() {
		return nganh;
	}

	public void setNganh(String nganh) {
		this.nganh = nganh;
	}
	
}
