public class VatPham {
    protected String tenVatPham;
    protected int chiSoSucManh;
    protected float heSoSucManh;
    protected int soVangQuyDoi;

    public VatPham() {
    }

    public double sucCongPha(){
        return this.chiSoSucManh*this.heSoSucManh;
    }

    public double totalVang(){
        return this.sucCongPha()*this.soVangQuyDoi;
    }

    public String getTenVatPham() {
        return tenVatPham;
    }

    public void setTenVatPham(String tenVatPham) {
        this.tenVatPham = tenVatPham;
    }

    public int getChiSoSucManh() {
        return chiSoSucManh;
    }

    public void setChiSoSucManh(int chiSoSucManh) {
        this.chiSoSucManh = chiSoSucManh;
    }

    public float getHeSoSucManh() {
        return heSoSucManh;
    }

    public void setHeSoSucManh(float heSoSucManh) {
        this.heSoSucManh = heSoSucManh;
    }

    public int getSoVangQuyDoi() {
        return soVangQuyDoi;
    }

    public void setSoVangQuyDoi(int soVangQuyDoi) {
        this.soVangQuyDoi = soVangQuyDoi;
    }
}
