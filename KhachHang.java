package secction5lap2;

public class KhachHang {
    String MaKH,HoTen,ngayHoaDon;
    int soluong,thanhtien;
    int[] dm = {50,100,200};

    public String getMaKH() {
        return MaKH;
    }

    public String getHoTen() {
        return HoTen;
    }

    public String getNgayHoaDon() {
        return ngayHoaDon;
    }

    public int getSoluong() {
        return soluong;
    }

    public int getThanhtien() {
        return thanhtien;
    }

    public void setMaKH(String maKH) {
        MaKH = maKH;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public void setNgayHoaDon(String ngayHoaDon) {
        this.ngayHoaDon = ngayHoaDon;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public void setThanhtien(int thanhtien) {
        this.thanhtien = thanhtien;
    }
}
