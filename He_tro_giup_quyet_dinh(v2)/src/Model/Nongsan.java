package Model;

public class Nongsan {
	private String name;
	private String ma_nong_san;
	private double dientich;
	private double giaca;
	private double nangsuattoida;
	private double chiphi;
	public Nongsan(String name,String ma,double dientich,double giaca,double nangsuattoida,double chiphi) {
		this.name=name;
		this.ma_nong_san=ma;
		this.dientich=dientich;
		this.giaca=giaca;
		this.nangsuattoida=nangsuattoida;
		this.chiphi=chiphi;
	}
	public String get_name() {
		return this.name;
	}
	public String get_manongsan() {
		return this.ma_nong_san;
	}
	public double get_nangsuattoida() {
		return this.nangsuattoida;
	}
	public double getDientich() {
		return this.dientich;
	}
	public double getGiaca() {
		return this.giaca;
	}
	public double get_chiphi() {
		return this.chiphi;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setManongsan(String ma) {
		this.ma_nong_san=ma;
	}
	public void setDientich(double dientich) {
		this.dientich=dientich;
	}
	public void setGiaca(double gia) {
		this.giaca=gia;
	}
	public void setNangsuattoida(double nangsuat) {
		this.nangsuattoida=nangsuat;
	}
	public void setChiphi(double chiphi) {
		this.chiphi=chiphi;
	}
	public double tinhLoiNhuan() {
		double loinhuan;
		loinhuan=(this.giaca*this.nangsuattoida-this.chiphi)*this.dientich;
		return loinhuan;
	}
	public double tinhChiphi() {
		double chiphi;
		chiphi=this.chiphi*this.dientich;
		return chiphi;
	}
}
