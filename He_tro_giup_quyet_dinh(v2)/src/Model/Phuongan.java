package Model;
import java.util.*;
public class Phuongan {
	private Vector<Nongsan> v;
	private double loinhuan;
	private double chiphi;
	public double getLoinhuan() {
		return this.loinhuan;
	}
	public double getChiphi() {
		return this.chiphi;
	}
	public void setLoinhuan(double loinhuan) {
		this.loinhuan=loinhuan;
	}
	public void setChiphi(double chiphi) {
		this.chiphi=chiphi;
	}
	public void khoiTao(Vector<Nongsan> c) {
		this.v=new Vector<Nongsan>(c);
	}
	public Vector<Nongsan> getVectorNS(){
		return this.v;
	}
	public double tongChiPhi() {
		double chiphi = 0;
		for(int i=0;i<this.v.size();i++) {
			Nongsan ns=(Nongsan)this.v.get(i);
			chiphi = chiphi + ns.tinhChiphi();
		}
		return chiphi;
	}
	public double tongLoiNhuan() {
		double loinhuan=0;
		for(int i=0;i<this.v.size();i++) {
			Nongsan ns=(Nongsan)this.v.get(i);
			loinhuan=loinhuan+ns.tinhLoiNhuan();
		}
		return loinhuan;
	}
}