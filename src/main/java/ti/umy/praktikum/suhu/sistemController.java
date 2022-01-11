package ti.umy.praktikum.suhu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class sistemController {
    @RequestMapping("/KONVERSI")
    @ResponseBody
    public String getBerat(){
        String konversi = " ";
        
        double c =100;
        double f = 100;
        double r = 32;
        
        double suhu;
        
        String pilih =  "ckef";
        
        if(pilih=="CkeF"){
            suhu = (c * 9/5) + r;
            konversi = "KONVERSI C : F = " + suhu;
            
        }else if (pilih == "FkeC"){
            suhu = (f - r) * 5/9;;
            konversi = "KONVERSI F : C = " + suhu;
        }else if(pilih == "CkeR"){
            suhu = c * 4/5;
            konversi = "KONVERSI C : R = " + suhu;
        }
        else if(pilih == "RkeC"){
            suhu =  r * 5/4;
            konversi = "KONVERSI R : C = " + suhu;
        }
        else
        {
            konversi = "tidak ditemukan";
        }
        return konversi;
    }
    
}
