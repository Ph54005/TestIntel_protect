import static org.junit.jupiter.api.Assertions.*;

import com.example.demo.SinhVien;
import com.example.demo.SinhVienService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SinhVienTest {
    private SinhVienService sinhVienService;
    private SinhVien sinhVien;

    @BeforeEach
    void setUp() {
        sinhVienService = new SinhVienService();
        sinhVien = new SinhVien("SV001", "Nguyen Van A", 20, 8.5f, 3, "CNTT");
    }

    @Test
    void testSuaSinhVienThanhCong() {
        sinhVienService.suaSinhVien(sinhVien, "Le Van B", 21, 9.0f, 4, "Kinh tế");

        assertEquals("Le Van B", sinhVien.getTen());
        assertEquals(21, sinhVien.getTuoi());
        assertEquals(9.0f, sinhVien.getDiemTrungBinh());
        assertEquals(4, sinhVien.getKyHoc());
        assertEquals("Kinh tế", sinhVien.getChuyenNganh());

    }



    @Test
    void testSuaSinhVien_NullSinhVien() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            sinhVienService.suaSinhVien(null, "Le Van B", 21, 9.0f, 4, "Kinh tế");
        });

        assertEquals("Sinh viên không được null", exception.getMessage());
    }




    @Test
    void testSuaSinhVien_TenRong() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            sinhVienService.suaSinhVien(sinhVien, "", 21, 9.0f, 4, "Kinh tế");
        });

        assertEquals("Tên và chuyên ngành không được để trống", exception.getMessage());
    }





    @Test
    void testSuaSinhVien_ChuyenNganhRong() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            sinhVienService.suaSinhVien(sinhVien, "Le Van B", 21, 9.0f, 4, "");
        });

        assertEquals("Tên và chuyên ngành không được để trống", exception.getMessage());
    }
}
