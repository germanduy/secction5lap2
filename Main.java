package secction5lap2;

public class Main {
    public static void main(String[] args) {

        KhachHangVietNam duy1 = new KhachHangVietNam();
        duy1.setMaKH("VN1");
        duy1.setHoTen("Lê Đức Duy");
        duy1.setNgayHoaDon("1/2022");
        duy1.setDoituongKH(duy1.danhsachdoituong[1]);
        duy1.setSoluong(300);

        KhachHangVietNam duy2 = new KhachHangVietNam();
        duy2.setMaKH("VN1");
        duy2.setHoTen("Lê Đức Duy");
        duy2.setNgayHoaDon("1/2022");
        duy2.setDoituongKH(duy1.danhsachdoituong[2]);
        duy2.setSoluong(400);


        KhachHangNuocNgoai german1 =new KhachHangNuocNgoai();
        german1.setMaKH("VN1");
        german1.setHoTen("Lê Đức Duy");
        german1.setNgayHoaDon("1/2022");
        german1.setQuocTich("vn");
        german1.setSoluong(500);

        KhachHangNuocNgoai german2 = new KhachHangNuocNgoai();
        german2.setMaKH("VN1");
        german2.setHoTen("Lê Đức Duy");
        german2.setNgayHoaDon("1/2022");
        german2.setQuocTich("vn");
        german2.setSoluong(600);


        DSKH khuvuc1 = new DSKH();
        khuvuc1.tongVN();
        khuvuc1.tongNN();
        khuvuc1.aveKHNN();

    }


}
