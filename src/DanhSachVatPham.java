import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhSachVatPham {

    private final List<VatPham> arr;
    public DanhSachVatPham(){
        this.arr=new ArrayList<>();
    }

    // câu 1
    public void nhapDanhSach(){
        Scanner sc = new Scanner(System.in);
        System.out.println("=========================================");
        System.out.println("Nhập thông tin các vật phẩm cần thu nhập");

        System.out.print("Nhập tên vật phẩm búa: ");
        VatPham chiecBua = new ChiecBuaThan();
        chiecBua.setTenVatPham(sc.nextLine());
        this.arr.add(chiecBua);

        System.out.print("Nhập tên vật phẩm bao tay: ");
        VatPham baoTay = new BaoTaySamSet();
        baoTay.setTenVatPham(sc.nextLine());
        this.arr.add(baoTay);

        System.out.print("Nhập tên vật phẩm hòn đá: ");
        VatPham honDa = new HonDaKichNo();
        honDa.setTenVatPham(sc.nextLine());
        this.arr.add(honDa);

        System.out.print("Nhập tên vật phẩm rìu: ");
        VatPham cayRiu = new CayRiuPhepThuat();
        cayRiu.setTenVatPham(sc.nextLine());
        this.arr.add(cayRiu);

        System.out.print("Nhập tên vật phẩm gậy: ");
        VatPham cayGay = new CayGayChienThan();
        cayGay.setTenVatPham(sc.nextLine());
        this.arr.add(cayGay);
    }


    // câu 2
    public void inDanhSach(){
        System.out.println("=========================================");
        System.out.println("DANH SÁCH VẬT PHẨM SPON cần tìm: ");
        for (VatPham vp : arr) {
            System.out.println("Tên Vật Phẩm: " + vp.tenVatPham);
            System.out.println("Sức Công Phá: " +vp.sucCongPha());
            System.out.println("Số vàng cần để đổi vật phẩm: " +vp.totalVang());
            System.out.println("-----------------------------------------");
        }
    }

    // câu 3
    public void vatPhamMacNhat(){
        double max = 0;
        for(VatPham vp : this.arr){
            if(vp.totalVang() > max){
                max= vp.totalVang();
            }
        }
        for(VatPham vp : this.arr){
            if(vp.totalVang() == max){
                System.out.println("=========================================");
                System.out.println("Vật phẩm cần nhiều vàng để đổi nhất: "+ vp.tenVatPham);
            }
        }
    }

    // câu 4

    public void giaiCuu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("=========================================");
        System.out.print("Nhập số vàng SPON đã thu thập được: ");
        double gold = scanner.nextInt();

        double tongvangcan = 0;
        for (VatPham vp : this.arr){
            tongvangcan += vp.totalVang();
        }
        System.out.println("Tổng vàng cần để giải cứu đồng đội: " +tongvangcan);
        if(gold >= tongvangcan){
            System.out.println("Chúc mừng!!! Spon đã giải cứu thành công đồng đội! ^^");
        }else{
            System.out.println("Spon đã không giải cứu thành cộng đồng đội của mình. :((");
        }
        System.out.println("----------------------*********-------------------");
    }
}
