package practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class finddifference {
    public static void main(String[] args) {

        int sum = 0;
//        List<Integer> intList = new ArrayList<>(Arrays.asList());
        List<Integer> intList = new ArrayList<>(Arrays.asList(1,1,1,2,1,3,1,1,1,2,1,1,2,1,1,1,1,1,1,1,2,1,1,2,2,1,1,1,1,3,1,2,4,1,1,1,1,1,1,1,1,1,1,2,2,1,1,1,1,1,1,1,1,1,1,1,2,2,3,1,1,2,2,8,1,2,1,5,1,1,3,2,1,1,2,2,3,4,1,1,32,2,3,4,39,1,2,2,8,3,4,2,1,9,1,2,3,1,7,3,3,5,3,14,3,2,1,1,4,4,1,2,5,1,14,3,2,4,2,3,2,2,4,2,1,1,4,1,1,2,1,1,1,1,1,2,1,1,2,6,4,1,2,4,11,2,4,7,1,2,1,2,9,5,1,4,6,3,9,1,10,6,10,1,7,6,1,8,3,1,13,2,11,1,11,17,2,11,1,4,1,2,12,18,5,23,17,8,2,19,15,68,7,5,1,7,22,32,5,5,11,9,3,9,20,6,10,26,4,9,12,11,31,28,24,2,6,12,1,6,2,5,12,15,13,5,14,76,2,4,17,17,28,37,27,12,10,1,3,6,61,12,8,58,10,10,18,5,59,20,12,43,75,22,6,3,22,30,16,54,58,35,37,5,1,9,38,62,8,10,41,69,7,9,11,25,44,14,30,6,43,30,52,37,12,27,10,37,10,139,10,29,68,21,69,21,3,1,45,8,4,1,2,15,9,10,1,13,2,14,25,11,32,8,1,2,5,4,4,8,1,1,6,3,26,16,40,150,150,1,1,24,2,1,7,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0));
        for (int i : intList ){
            sum += i;
        }
        System.out.println(sum);

        String ss1 = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAwA2NrQAqcoBsYzyMbdaOwGNWBNVLx9eVV8i39CbKZ35T+4ATqq6Ja/mTTN8t1OacEOiRVltc3cYXOGVMXKqsDXkkgKsYMj60QT7Zb7pqLN6RAUVW18c2d0dXeDUq4HPjLRCwFFTztUCVYf72RAtOW6cF63I0w6hy6XyJI75dJdlRzDHbA1Wfml0MfCm+Uc0ocH945OqB68jnMR8MEDjYmTmziZWPp7m//XmVrdwW7znZB91ivXi7+zg0Jgk2fBM/RGm3775N4HubpLCSmpE2fKEK0F29qTmrM9VbsNi83xlgoThWsrKUNMCXNZ6HqOauFZIZOy+iP4yyKy5+M2ksbQIDAQAB";
        String ss2 = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAwA2NrQAqcoBsYzyMbdaOwGNWBNVLx9eVV8i39CbKZ35T+4ATqq6Ja/mTTN8t1OacEOiRVltc3cYXOGVMXKqsDXkkgKsYMj60QT7Zb7pqLN6RAUVW18c2d0dXeDUq4HPjLRCwFFTztUCVYf72RAtOW6cF63I0w6hy6XyJI75dJdlRzDHbA1Wfml0MfCm+Uc0ocH945OqB68jnMR8MEDjYmTmziZWPp7m//XmVrdwW7znZB91ivXi7+zg0Jgk2fBM/RGm3775N4HubpLCSmpE2fKEK0F29qTmrM9VbsNi83xlgoThWsrKUNMCXNZ6HqOauFZIZOy+iP4yyKy5+M2ksbQIDAQAB";
        System.out.println("ss1.equals(ss2) = "+ss1.equals(ss2));
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        String[] s1 = "0933101268','a0905317552','a0912264895','a0915896393','a0919906629','a0925198398','a0928209211','a0928228055','a0928561121','a0929533947','a0930034032','a0932049507','a0935087283','a0935211547','a0935998626','a0936101103','a0937165410','a0937936731','a0938038831','a0952499057','a0952797966','a0952995079','a0953735853','a0958506832','a0958693916','a0963670538','a0963766853','a0970614598','a0972187077','a0976006983','a0981277516','a098127751601','a09826691','a10356839','a17529651','a19701988','a24702353','a24982892','a26778906','a30343849','a41022154','a42419956','a42544526','a50661271','a53093267','a53768207','a53777297','a54677036','a55827960','a85123088','a97383720','aa0939326355','aa24986526','Aakii001','ab630530','abc0707xyz102','adad57032','ahma01','anthonyl198','ApplePayFB','AS27536131','b0932162899','b1044413','bagua01','baii92904996','basegarden','bccsoftdemo','bccsoftkao','beast005p','beast006p','beast007p','boazdemo','brickstest','c0926957369','c24975494','Candy3626','candylee8088','chachathe01','chen700729','ChesterTest01','ChesterTest02','CHWdapu00101','CHWdapu00102','CHWdapu00201','CHWdapu00202','CHWdapu003','CHWdapu00401','CHWdapu00402','CHWdapu00403','CHWdapu00501','CHWdapu00502','CHWdapu006','CHWdapu007','CHWdapu008','CHWdapu009','CHWdapu010','CHWdapu011','CHWdapu012','CHWdapu0121','CHWdapu013','CHWdapu015','CHWdapu019','cicmachine01','Clothes27','csc61sr','cschen1207','Cyspera','d0913179699','dartslivetest','DeltaTest01','dragon001','dragon002','dragon003','dragon004','dragon005','dragon006','dragon007','emei168','evelyn1016','f0906209249','f0910031279','f0928112230','f0963572467','f0980418818','fannyt22897279','fansiTEST','fdlife14','fgspos','goldstar01','guomin1000','guomin1028','guomin1068','guomin1086','guomin1088','guomin1089','guomin1138','guomin1688','guomin1975','guomin21','guomin51','guomina04','guomina05','guomina09','guomina15','guomina17','guomina20','guomina23','guomina27','guominb02','guominb03','guominb05','guominb08','guominb12','guominb16','guominb21','guominb22','guominb24','guominc04','guomind09','guomind26','guomind261','guomind27','guomind40','guomind42','guomind43','guomind52','guominf01','guominf02','guomino12','guomino17','guomino21','guomino23','hanjie038','hdit','hello088','hello122','hello141','hello189','hello73','helloa04','helloa06','hellob06','helloc09','hellod02','helloo15','henlitest','hsu6111033','HT13181779','i24975494','ibendom0507','iCH001','iCH002','iCH003','iCH004','iCH005','iCH006','iCH007','iCH008','iCH009','iCH010','iCH011','iCH012','iCH013','iCH014','iCH015','iCH016','iCH017','iCH018','iCH019','iCH020','iCH201','iCH202','iCH203','iCH204','iCH205','iCH206','iCH207','iCH208','iCH209','iCH210','iCH211','iCH212','iCH213','iCH214','iCH215','iCH216','iCH217','iCH218','iCH219','iCH220','iCH221','iCH222','iCH223','iCH224','iCH225','iCH226','iCH227','iCH228','iCH229','iCH230','if01','if02','igcar001','ImaoTest','iMartsTest','int00379','int02','int03','int04','int05','int06','int07','int08','int09','int10','int11','int12','int13','int14','int15','int16','int17','int18','int19','int20','int21','int22','int23','int24','int25','int26','int27','int28','int29','int30','int31','int32','int33','int34','int35','int36','int37','int38','int39','int40','int41','int42','int43','int44','int45','int46','int47','int48','int49','int50','intella1','intella2101','intella2102','intella2103','intella2104','intella2105','intellaHQ','intellaHQ01','intellaHQ02','intellatest1','intellavm006','iS0001','is200077','iTaxiDemo','iTest','iTest101','iTest1011','iTest102','iTest1021','iTest2','iTest201','iTest2011','iTest202','iTest2021','iTest3','iTest301','iTest3011','iTest302','iTest3021','iTest4','iTest401','iTest4011','iTest402','iTest4021','jichangD0006','jichangD0012','jichangD0013','jichangS0101','jichangS0113','jichangS0702','jichangS0703','jichangS0704','jichangS0705','jichangS0906','jichangS0907','jichangS0908','jichangS0909','jichangS0910','jichangS0911','jichangS0912','jichangS0913','jichangS0917','jichangS1114','jichangS1115','jichangS1116','jichangS1310','jichangS1317','jichangT0001','jichangT0002','jichangT0003','jichangT0004','jichangT0007','jichangT0008','jichangT0009','jichangT0010','jichangT0011','jichangT0012','jichangT0013','jichangT0014','jichangT0015','jichangT0016','jichangT0018','jichangT0022','jichangT0023','jichangT0028','jichangT0029','jichangT0030','jichangT0032','jichangT0033','jichangT0034','jichangT0035','jichangT0036','jichangT0037','jichangT0038','jichangT0039','jichangT0040','jichangT0041','jichangT0042','jichangT0043','jichangT0045','jichangT0046','jichangT0049','jichangT0053','jichangT0054','jichangT0055','jichangT0060','jichangT0062','jichangT0064','jichangT0065','jichangT0066','jichangT0071','jichangT0073','jichangT0075','jichangT0079','jichangT0081','jichangT0087','jichangT011','jichangT0171','jichangT1001','jinshan01','jinshan02','jinshan03','jinshan04','jinshan05','jinshan06','jinshan08','jinshan09','jinshan10','Jinshan1GO','Jinshan2GO','Jinshan3GO','Jinshan4GO','Jinshan5GO','Jinshan6GO','Jinshan7GO','JS0038','JS0039','JS0040','JS0041','JS0042','JS0043','JS0044','JS0045','JS0046','JS0047','JS0048','JS0049','JS0050','JS0051','JS0052','JS0053','JS0054','JS0055','JS0056','JS0057','JS0058','JS0061','JS0062','JS0063','JS0064','JS0065','JS0067','JS0068','JS0069','JS0070','JS0071','JS0072','JS0073','JS0074','JS0075','JS0076','JS0077','JS0078','JS0079','JS0080','JS0081','JS0082','JS0083','JS0084','JS0085','JS0086','JS0087','JS0088','JS0089','JS0090','JS0091','JS0092','JS0093','JS0094','JS0095','JS0096','JS0097','JS099901','JS099902','JSM027','JSM030','JSM031','jstaroking11','KAi001','KAi002','KAi006','KAi009','KAi010','KAi011','KAi012','KAi013','KAi014','KAi015','KAi016','KAi017','KAi018','KAi019','KAi020','KAi024','KAi025','KAi027','KAi028','KAi029','KAi031','KAi032','KAi033','KAi037','KAi040','KAi044','KAi045','KAi049','KAi053','KAi055','KAi056','KAi057','KAi060','KAi061','KAi062','KAi063','KAi064','KAi068','KAi077','KAi079','KAi081','KAi084','KAi085','KAi089','KAi099','KAi1001','KAi102','KAi103','KAi108','KAi112','KAi1150','KAi116','KAi1160','KAi1164','KAi118','KAi123','KAi124','KAi125','KAi126','KAi127','KAi128','KAi130','KAi132','KAi136','KAi146','KAi149','KAi150','KAi151','KAi155','KAi156','KAi160','KAi161','KAi162','KAi164','KAi165','KAi168','KAi169','KAi170','KAi173','KAi174','KEL001','KEL002','KEL003','KEL004','KEL005','KEL006','KEL007','KEL008','KEL009','KEL010','KEL011','KEL012','KEL013','KEL014','KEL015','KEL016','KEL017','KEL018','KEL019','KEL020','KEL021','KEL022','KEL023','KEL024','KEL025','KEL026','KEL027','KEL028','KEL029','KEL030','KEL031','KEL032','KEL033','KEL034','KEL035','KEL036','KEL037','KEL038','KEL039','KEL040','kelcs','kelcs001','kelcs002','kelcs003','kelcs004','kelcs005','kelcs006','kelcs007','kelcs008','kelcs009','kelcs010','kelcs011','kelcs012','kelcs013','kelcs014','kelcs015','kelcs016','kelcs017','kelcs018','kelcs019','kelcs020','kelcs021','kelcs022','kelcs023','kelcs024','kelcs025','kelcs026','kelcs027','kelcs028','kelcs029','kelcs030','kelcs031','kelcs032','kelcs033','kelcs034','kelcs035','kelcs036','kelcs037','kelcs038','kelcs039','kelcs040','kk23113009','komou34','komoub04','komoub19','komoub20','LCSHOP01','LCSHOP02','leo01517124','lingya116','lingya16888','lingya20','lingya2280','lingyae17','lingyae20','lingyae31','lingyan03','lingyap20','lingyap33','lingyap36','lingyap37','lingyap66','lingyas21','lingyas28','lingyas31','lingyas44','lingyaso2','lingyat005','lingyat013','lingyat048','lingyat058','lingyat066','lingyat067','lingyat077','lingyat08','lingyat100','lingyat128','lingyat148','lingyat1571','lingyat220','lingyat5499','lingyat6688','lingyat888','lingyat99','linmu0727','liuhe001','liuhe0101','liuhe036','liuhe038','liuhe048','liuhe071','liuhe122','liuhe123','liuhe155','longhua003','longhua005','longhua0103','longhua012','longhua016','longhua035','longhua043','longhua045','longhua057','longhua058','longhua060','longhua061','longhua066','longhua071','longhua074','longhua078','longhua085','longhua097','longhua100','longhua103','longhua112','longhua113','longhua125','longhua127','longhua130','longhua131','longhua137','longhua139','longhua142','longhua145','longhua160','longhua169','longhua198','LuzhouA01','LuzhouA02','LuzhouA03','LuzhouA04','LuzhouA05','LuzhouA06','LuzhouA07','LuzhouA08','LuzhouA09','LuzhouA10','LuzhouA11','LuzhouA12','LuzhouA13','LuzhouA14','LuzhouA15','LuzhouA16','LuzhouA17','LuzhouA18','LuzhouA19','LuzhouA20','LuzhouA21','LuzhouA22','LuzhouA23','LuzhouA24','LuzhouA25','LuzhouA26','LuzhouA27','LuzhouA28','LuzhouA29','LuzhouA30','LuzhouA31','LuzhouA32','LuzhouA33','LuzhouA34','LuzhouA35','LuzhouA36','LuzhouA37','LuzhouA38','LuzhouA39','LuzhouA40','LuzhouA41','LuzhouA42','LuzhouA43','LuzhouA44','LuzhouA45','LuzhouA46','LuzhouA47','LuzhouA48','LuzhouA49','LuzhouA50','LuzhouA51','LuzhouA52','LuzhouA53','LuzhouA54','LuzhouA55','LuzhouA56','LuzhouA57','LuzhouA58','LuzhouA59','LuzhouA60','LuzhouA61','LuzhouA62','LuzhouA63','LuzhouA64','LuzhouA65','LuzhouA66','LuzhouA67','LuzhouA68','LuzhouA69','LuzhouA70','LuzhouA71','LuzhouA72','LuzhouA73','LuzhouA74','LuzhouA75','LuzhouA76','LuzhouA77','LuzhouA78','LuzhouA79','LuzhouA80','lychsu57','MAJIT003','mellisa24986184','militarypolicer01','mll073067','mok17895','Monga001','Monga002','Monga003','Monga004','Monga005','Monga006','Monga008','Monga009','Monga010','Monga011','Monga012','Monga014','Monga015','Monga016','Monga017','Monga018','Monga019','Monga020','Monga021','Monga023','Monga024','Monga025','Monga027','Monga029','Monga032','Monga033','Monga034','Monga035','Monga036','Monga037','Monga038','Monga040','Monga041','Monga042','Monga043','Monga045','Monga048','Monga050','Monga051','Monga052','Monga053','Monga055','Monga057','Monga059','Monga061','Monga062','Monga065','Monga067','Monga068','Monga070','Monga071','Monga072','Monga074','Monga075','Monga076','Monga077','Monga078','Monga079','Monga081','Monga082','Monga083','Monga084','Monga087','Monga088','Monga089','Monga090','Monga091','Monga092','Monga094','Monga096','Monga098','Monga099','Monga100','Monga101','Monga104','Monga105','Monga106','Monga107','Monga108','Monga109','Monga110','Monga111','Monga112','Monga114','Monga118','Monga135','Monga137','Monga140','Monga151','Monga152','Monga153','Monga154','Monga158','Monga160','Monga165','Monga167','Monga168','Monga169','Monga170','Monga171','Monga172','Monga173','Monga174','Monga176','NDHU','neiwei03','neiwei43','neiweia14','neiwein17','NingxiaM001','NingxiaM002','NingxiaM003','NingxiaM004','NingxiaM005','NingxiaM006','NingxiaM007','NingxiaM008','NingxiaM009','NingxiaM010','NingxiaM011','NingxiaM013','NingxiaM014','NingxiaM1013','NingxiaS001','NingxiaS002','NingxiaS003','NingxiaS004','NingxiaS005','NingxiaS006','NingxiaS007','NingxiaS008','NingxiaS009','NingxiaS010','NingxiaS011','NingxiaS012','NingxiaS014','NingxiaS015','NingxiaS016','NingxiaS017','NingxiaS018','NingxiaS019','NingxiaS020','NingxiaS022','NingxiaS023','NingxiaS024','NingxiaS025','NingxiaS026','NingxiaS027','NingxiaS1026','NingxiaT0013','NingxiaT002','NingxiaT004','NingxiaT006','NingxiaT007','NingxiaT0071','NingxiaT0079','NingxiaT009','NingxiaT010','NingxiaT011','NingxiaT012','NingxiaT013','NingxiaT0135','NingxiaT014','NingxiaT015','NingxiaT016','NingxiaT018','NingxiaT019','NingxiaT020','NingxiaT021','NingxiaT022','NingxiaT024','NingxiaT025','NingxiaT027','NingxiaT028','NingxiaT029','NingxiaT031','NingxiaT033','NingxiaT034','NingxiaT035','NingxiaT037','NingxiaT038','NingxiaT039','NingxiaT041','NingxiaT043','NingxiaT044','NingxiaT046','NingxiaT047','NingxiaT050','NingxiaT051','NingxiaT052','NingxiaT054','NingxiaT055','NingxiaT056','NingxiaT057','NingxiaT058','NingxiaT061','NingxiaT065','NingxiaT071','NingxiaT073','NingxiaT074','NingxiaT075','NingxiaT077','NingxiaT079','NingxiaT080','NingxiaT081','NingxiaT082','NingxiaT084','NingxiaT085','NingxiaT086','NingxiaT088','NingxiaT089','NingxiaT090','NingxiaT094','NingxiaT097','NingxiaT098','NingxiaT100','NingxiaT102','NingxiaT105','NingxiaT106','NingxiaT107','NingxiaT109','NingxiaT110','NingxiaT111','NingxiaT113','NingxiaT114','NingxiaT115','NingxiaT116','NingxiaT117','NingxiaT119','NingxiaT120','NingxiaT121','NingxiaT122','NingxiaT123','NingxiaT125','NingxiaT126','NingxiaT127','NingxiaT128','NingxiaT129','NingxiaT130','NingxiaT132','NingxiaT135','NingxiaT137','NingxiaT139','NingxiaT143','NingxiaT145','NingxiaT148','NingxiaT149','NingxiaT150','NingxiaT151','NingxiaT154','NingxiaT155','NingxiaT157','NLTtest','nnptest83555960','No6ToastTest','NXSPOT001','NXSPOT002','NXSPOT003','NXSPOT004','NXSPOT005','oceanpark','okck0108','otome01','p851025','PlusPayTest','purelytest','roundhouse','Ruifang02','Ruifang03','Ruifang04','Ruifang05','Ruifang08','Ruifang10','Ruifang11','Ruifang12','Ruifang13','Ruifang14','Ruifang15','Ruifang21','Ruifang22','Ruifang25','Ruifang26','Ruifang27','Ruifang28','Ruifang29','Ruifang30','Ruifang31','Ruifang32','Ruifang33','Ruifang35','Ruifang36','Ruifang37','Ruifang41','s2pd010','s7651800','SakuraTest','samkuo0521','sanmina001','sanmina016','sanminb04','sanmine022','sanmine11','sanmine12','sanmint001','sanmint008','sanmint051','sanmint055','sanmint072','sanmint077','sanmint091','sanmint132','sanmint179','sanmint180','sanmint1801','sanmint187','sanmint189','sanmint194','sanmint268','sanmint688','sanmint958','sanwu998','scsb01','sdcoffeeA001','sdcoffeeA002','sdcoffeehq','SeSA','shyangsoontest','SLGtest','Store001','super','super','supercandy01','supercar01','supercoffee01','superdoll','superegg01','supergift02','superktv02','T10816','takotest','tdnet','THCdemo','topvmetest','topvmetest2','topvmetest3','tpjservice','TUNG001','TUNG002','TUNG003','TUNG004','TUNG005','TUNG006','TUNG007','TUNG008','TUNG009','TUNG010','TUNG011','TUNG012','TUNG013','TUNG014','TUNG015','TUNG016','TUNG017','TUNG018','TUNG019','TUNG020','TUNG021','TUNG022','TUNG023','TUNG024','TUNG025','TUNG026','TUNG027','TUNG028','TUNG029','TUNG030','TUNG031','TUNG032','TUNG033','TUNG034','TUNG035','TUNG036','TUNG037','TUNG038','TUNG039','TUNG040','TUNG041','TUNG042','TUNG043','TUNG044','TUNG045','TUNG046','TUNG047','TUNG048','TUNG049','TUNG050','TUNG051','TUNG052','TUNG053','TUNG054','TUNG055','TUNG056','TUNG057','TUNG058','TUNG059','TUNG060','TUNG061','TUNG062','tunghuaTEST','tw0930962408','tw15779956','tw26733401','tw26767176','tw50595224','twboy_anthony','TXperTest01','UbutiTest','uwash01','W001','W002','wade6073','wang23450515','wang23450538','WHN001','WHN002','WHN003','WHN004','WHN005','WHN006','WHN007','WHN008','WHN009','WHN010','WHN011','WHN012','WHN013','WHN014','WHN015','WHN016','WHN017','WHN018','WHN019','WHN020','WHN021','WHN022','WHN023','WHN024','WHN025','WHN026','WHN027','WHN028','WHN029','WHN030','wl01402920','WTPOS','wunsian28','wunsian62','wunsian67','wunsian73','wunsiana5','wunsiani9','YaLien7075','yallvend001','ykyk0001','YM83531525','ymc45112','ymh21304839','yomeentest','yong33','yuanta01','z0912417277','Ziciang005','Ziciang008','Ziciang015','Ziciang018','Ziciang03','Ziciang04','Ziciang06','Ziciang117','Ziciang131','Ziciang157','Ziciang20".replaceAll("\'","").split(",");
        String[] s2 = "a97383720','a85123088','a53777297','emei168','PlusPayTest','Monga176','Monga174','Monga173','Monga172','Monga171','Monga170','Monga169','Monga168','Monga167','Monga165','Monga160','Monga158','Monga154','Monga153','Monga152','Monga151','Monga140','Monga137','Monga135','Monga118','Monga114','Monga112','Monga111','Monga110','Monga109','Monga108','Monga107','Monga106','Monga105','Monga104','Monga100','Monga099','Monga098','Monga096','Monga094','Monga092','Monga091','Monga090','Monga089','Monga088','Monga087','Monga084','Monga083','Monga082','Monga081','Monga079','Monga078','Monga077','Monga076','Monga075','Monga074','Monga072','Monga071','Monga070','Monga068','Monga067','Monga065','Monga062','Monga061','Monga059','Monga057','Monga055','Monga053','Monga052','Monga051','Monga050','Monga048','Monga045','Monga043','Monga042','Monga041','Monga040','Monga038','Monga037','Monga036','Monga035','Monga034','Monga033','Monga032','Monga029','Monga027','Monga025','Monga024','Monga023','Monga021','Monga020','Monga019','Monga018','Monga017','Monga016','Monga015','Monga014','Monga012','Monga011','Monga010','Monga009','Monga008','Monga006','Monga005','Monga004','Monga003','Monga002','Monga001','Monga101','liuhe155','liuhe036','liuhe0101','liuhe001','liuhe071','liuhe048','liuhe038','liuhe123','liuhe122','Ziciang015','AS27536131','Store001','CHWdapu019','CHWdapu015','longhua061','longhua112','lingyat148','hello122','sanmint958','intella1','a0963766853','boazdemo','lingya20','longhua198','longhua058','guomind261','CHWdapu0121','sanmina001','sanminb04','sanmina016','sanmine022','sanmine12','sanmine11','sanmint688','sanmint077','sanmint268','sanmint189','sanmint194','sanmint187','sanmint008','sanmint1801','sanmint179','sanmint180','sanmint132','sanmint091','sanmint072','sanmint001','sanmint051','sanmint055','yomeentest','THCdemo','longhua0103','a0905317552','CHWdapu013','Candy3626','jichangT0042','jichangT0035','NingxiaT0071','Ziciang20','Ziciang131','Ziciang018','Ziciang008','Ziciang117','Ziciang06','Ziciang005','Ziciang04','Ziciang03','lingyaso2','lingyas44','a0937936731','lingyat220','lingyat1571','lingyat048','Ziciang157','lingyat6688','lingyat5499','lingyat128','lingyat99','lingyat08','lingyat888','lingyat100','lingyat067','lingyat066','lingyat013','lingyat077','lingyat005','lingyat058','KEL040','KEL039','KEL038','KEL037','KEL036','KEL035','KEL034','KEL033','KEL032','KEL031','KEL030','KEL029','KEL028','KEL027','KEL026','KEL025','KEL024','KEL023','KEL022','KEL021','KEL020','KEL019','KEL018','KEL017','KEL016','KEL015','KEL014','KEL013','KEL012','KEL011','KEL010','KEL009','KEL008','KEL007','KEL006','KEL005','KEL004','KEL003','KEL002','KEL001','a0976006983','a0937165410','a0932049507','a0958506832','SakuraTest','SLGtest','a30343849','a0915896393','a54677036','oceanpark','lingyas31','lingyas28','lingyas21','lingyap66','lingyap37','lingyap36','lingyap33','lingyap20','lingyan03','lingyae31','lingyae20','lingyae17','lingya2280','lingya16888','lingya116','komoub04','komoub20','komoub19','komou34','wunsiani9','wunsiana5','wunsian73','wunsian67','wunsian62','wunsian28','neiwein17','neiweia14','neiwei43','neiwei03','a0929533947','helloc09','hello189','hello73','hello141','hello088','hellob06','hellod02','helloa06','helloa04','helloo15','guominf02','guominf01','hdit','a0963670538','a0928228055','SeSA','CHWdapu012','CHWdapu011','CHWdapu010','CHWdapu009','CHWdapu008','CHWdapu007','CHWdapu006','CHWdapu00502','CHWdapu00501','CHWdapu00403','CHWdapu00402','CHWdapu00401','CHWdapu003','CHWdapu00202','CHWdapu00201','CHWdapu00102','CHWdapu00101','NingxiaT102','jichangT011','NingxiaM014','a0928561121','longhua130','longhua113','longhua057','a26778906','a0930034032','a0952499057','a0952797966','a0919906629','a10356839','a17529651','a0935998626','a42544526','a42419956','NDHU','a0912264895','a53093267','a0938038831','a55827960','a50661271','a0952995079','a0925198398','a0936101103','a24702353','a0970614598','a0958693916','a0953735853','a41022154','a53768207','a09826691','jichangS0917','guomino23','guomino21','guomino17','guomino12','guomind52','guomind43','guomind42','guomind40','guomind27','guomind26','guomind09','guominc04','guominb24','guominb22','guominb21','guominb16','guominb12','guominb08','guominb05','guominb03','guominb02','guomina27','guomina23','guomina20','guomina17','guomina15','guomina09','guomina05','guomina04','guomin1975','guomin1688','guomin1138','guomin1089','guomin1088','guomin1086','guomin1068','guomin1028','guomin1000','guomin51','guomin21','longhua085','iCH230','iCH229','iCH228','iCH227','iCH226','iCH225','iCH224','iCH223','iCH222','iCH221','iCH220','iCH219','iCH218','iCH217','iCH216','iCH215','iCH214','iCH213','iCH212','iCH211','iCH210','iCH209','iCH208','iCH207','iCH206','iCH205','iCH204','iCH203','iCH202','iCH201','iCH020','iCH019','iCH018','iCH017','iCH016','iCH015','iCH014','iCH013','iCH012','iCH011','iCH010','iCH009','iCH008','iCH007','iCH006','iCH005','iCH004','iCH003','iCH002','iCH001','longhua169','longhua160','longhua145','longhua142','longhua139','longhua137','longhua131','longhua127','longhua125','longhua103','longhua100','longhua097','longhua078','longhua074','longhua071','longhua066','longhua060','longhua045','longhua043','longhua035','longhua016','longhua012','longhua005','longhua003','bccsoftkao','kelcs040','kelcs039','kelcs038','kelcs037','kelcs036','kelcs035','kelcs034','kelcs033','kelcs032','kelcs031','kelcs030','kelcs029','kelcs028','kelcs027','kelcs026','kelcs025','kelcs024','kelcs023','kelcs022','kelcs021','kelcs020','kelcs019','kelcs018','kelcs017','kelcs016','kelcs015','kelcs014','kelcs013','kelcs012','kelcs011','kelcs010','kelcs009','kelcs008','kelcs007','kelcs006','kelcs005','kelcs004','kelcs003','kelcs002','kelcs001','kelcs','ApplePayFB','tdnet','ymh21304839','TUNG062','TUNG061','TUNG060','TUNG059','TUNG058','TUNG057','TUNG056','TUNG055','TUNG054','TUNG053','TUNG052','TUNG051','TUNG050','TUNG049','TUNG048','TUNG047','TUNG046','TUNG045','TUNG044','TUNG043','TUNG042','TUNG041','TUNG040','TUNG039','TUNG038','TUNG037','iMartsTest','W002','W001','TUNG036','TUNG035','TUNG034','TUNG033','TUNG032','TUNG031','TUNG030','TUNG029','TUNG028','TUNG027','TUNG026','TUNG025','TUNG024','TUNG023','TUNG022','TUNG021','TUNG020','TUNG019','TUNG018','TUNG017','TUNG016','TUNG015','TUNG014','TUNG013','TUNG012','TUNG011','TUNG010','TUNG009','TUNG008','TUNG007','TUNG006','TUNG005','TUNG004','TUNG003','TUNG002','TUNG001','intella2105','intella2104','intella2103','intella2102','intella2101','cicmachine01','a19701988','jichangT0028','jichangT0015','basegarden','MAJIT003','WTPOS','WHN030','NXSPOT005','NXSPOT004','NXSPOT003','jichangD0013','jichangS1310','jichangT0087','jichangT0062','jichangT0037','dragon007','dragon006','dragon005','dragon004','dragon003','dragon002','dragon001','jichangT0011','jichangT0004','henlitest','Clothes27','LCSHOP02','LCSHOP01','KAi174','KAi173','KAi170','KAi169','KAi168','KAi165','KAi1164','KAi164','KAi162','KAi161','KAi1160','KAi160','KAi156','KAi155','KAi151','KAi1150','KAi150','KAi149','KAi146','KAi136','KAi132','KAi130','KAi128','KAi127','KAi126','KAi125','KAi124','KAi123','KAi118','KAi116','KAi112','KAi108','KAi103','KAi102','KAi099','KAi089','KAi085','KAi084','KAi081','KAi079','KAi077','KAi068','KAi064','KAi063','KAi062','KAi061','KAi060','KAi057','KAi056','KAi055','KAi053','KAi049','KAi045','KAi044','KAi040','KAi037','KAi033','KAi032','KAi031','KAi029','KAi028','KAi027','KAi025','KAi024','KAi020','KAi019','KAi018','KAi017','KAi016','KAi015','KAi014','KAi013','KAi012','KAi011','KAi010','KAi009','KAi006','KAi002','KAi1001','KAi001','NingxiaS027','NingxiaT014','Ruifang41','Ruifang31','Ruifang12','Ruifang27','Ruifang26','Ruifang04','Ruifang11','Ruifang03','Ruifang32','Ruifang22','Ruifang10','Ruifang33','Ruifang25','Ruifang21','Ruifang28','Ruifang35','Ruifang36','Ruifang14','Ruifang30','Ruifang37','Ruifang29','Ruifang05','Ruifang13','Ruifang15','Ruifang02','Ruifang08','ibendom0507','NingxiaT004','LuzhouA80','LuzhouA79','LuzhouA78','LuzhouA77','LuzhouA76','LuzhouA75','LuzhouA74','LuzhouA73','LuzhouA72','LuzhouA71','brickstest','NingxiaM1013','NingxiaM013','NingxiaS1026','NingxiaS026','NingxiaT0135','NXSPOT002','NXSPOT001','NingxiaT122','NingxiaT106','NingxiaT022','NingxiaT020','leo01517124','WHN015','WHN012','WHN024','WHN029','WHN028','WHN027','WHN026','WHN025','WHN023','WHN022','WHN021','WHN020','WHN019','WHN018','WHN017','WHN016','WHN014','WHN013','WHN011','WHN010','WHN009','WHN008','WHN007','WHN006','WHN005','WHN004','WHN003','WHN002','WHN001','jichangT0049','evelyn1016','NingxiaT148','NingxiaT010','NingxiaT097','HT13181779','LuzhouA35','LuzhouA34','LuzhouA33','LuzhouA32','LuzhouA31','LuzhouA30','LuzhouA29','LuzhouA28','LuzhouA27','LuzhouA26','LuzhouA25','LuzhouA24','LuzhouA23','LuzhouA22','LuzhouA21','LuzhouA20','LuzhouA19','LuzhouA18','LuzhouA17','LuzhouA16','LuzhouA15','LuzhouA14','LuzhouA13','LuzhouA12','LuzhouA11','LuzhouA10','LuzhouA09','LuzhouA08','LuzhouA07','LuzhouA06','LuzhouA05','LuzhouA04','LuzhouA03','LuzhouA02','LuzhouA70','LuzhouA69','LuzhouA68','LuzhouA67','LuzhouA66','LuzhouA65','LuzhouA64','LuzhouA63','LuzhouA62','LuzhouA61','LuzhouA60','LuzhouA59','LuzhouA58','LuzhouA57','LuzhouA56','LuzhouA55','LuzhouA54','LuzhouA53','LuzhouA52','LuzhouA51','LuzhouA50','LuzhouA49','LuzhouA48','LuzhouA47','LuzhouA46','LuzhouA45','LuzhouA44','LuzhouA43','LuzhouA42','LuzhouA41','LuzhouA40','LuzhouA39','LuzhouA38','LuzhouA37','LuzhouA36','LuzhouA01','Aakii001','NingxiaT150','hanjie038','TXperTest01','baii92904996','uwash01','jichangT0055','NingxiaT0079','NingxiaT0013','jichangT0064','jichangS0113','topvmetest3','i24975494','c24975494','bccsoftdemo','ChesterTest02','roundhouse','jichangD0012','jichangD0006','jichangS1317','jichangS1115','jichangS1114','jichangS0913','jichangS0912','jichangS0911','jichangS0910','jichangS0909','jichangS0908','jichangS0907','jichangS0906','jichangS0705','jichangS0704','jichangS0703','jichangS0702','jichangS0101','jichangT1001','jichangT0081','jichangT0079','jichangT0075','jichangT0073','jichangT0171','jichangT0071','jichangT0066','jichangT0065','jichangT0060','jichangT0054','jichangT0053','jichangT0046','jichangS1116','jichangT0045','jichangT0043','jichangT0041','jichangT0040','jichangT0039','jichangT0038','jichangT0036','jichangT0034','jichangT0033','jichangT0032','jichangT0030','jichangT0029','jichangT0023','jichangT0022','jichangT0018','jichangT0016','jichangT0014','jichangT0013','jichangT0012','jichangT0010','jichangT0009','jichangT0008','jichangT0007','jichangT0003','jichangT0002','jichangT0001','NingxiaM011','NingxiaM010','NingxiaM009','NingxiaM008','NingxiaM007','NingxiaM006','NingxiaM005','NingxiaM004','NingxiaM003','NingxiaM002','NingxiaM001','NingxiaS024','NingxiaS023','NingxiaS022','NingxiaS020','NingxiaS019','NingxiaS018','NingxiaS017','NingxiaS016','NingxiaS015','NingxiaS014','NingxiaS012','NingxiaS011','NingxiaS010','NingxiaS009','NingxiaS008','NingxiaS007','NingxiaS006','NingxiaS005','NingxiaS004','NingxiaS003','NingxiaS002','NingxiaS001','NingxiaT157','NingxiaT155','NingxiaT154','NingxiaT151','NingxiaT149','NingxiaT145','NingxiaT143','NingxiaT139','NingxiaT137','NingxiaT135','NingxiaT132','NingxiaT130','NingxiaT129','NingxiaT128','NingxiaT127','NingxiaT126','NingxiaT125','NingxiaT123','NingxiaT121','NingxiaT120','NingxiaT119','NingxiaT117','NingxiaT116','NingxiaT115','NingxiaT114','NingxiaT113','NingxiaT111','NingxiaT110','NingxiaT109','NingxiaT107','NingxiaT105','NingxiaT100','NingxiaT098','NingxiaT094','NingxiaT090','NingxiaT089','NingxiaT088','NingxiaT086','NingxiaT085','NingxiaT084','NingxiaT082','NingxiaT081','NingxiaT080','NingxiaT079','NingxiaT077','NingxiaT075','NingxiaT074','NingxiaT073','NingxiaT071','NingxiaT065','NingxiaT061','NingxiaT058','NingxiaT057','NingxiaT056','NingxiaT055','NingxiaT054','NingxiaT052','NingxiaT051','NingxiaT050','NingxiaT047','NingxiaT046','NingxiaT044','NingxiaT043','NingxiaT041','NingxiaT039','NingxiaT038','NingxiaT037','NingxiaT035','NingxiaT034','NingxiaT033','NingxiaT031','NingxiaT029','NingxiaT028','NingxiaT027','NingxiaS025','NingxiaT025','NingxiaT024','NingxiaT021','NingxiaT019','NingxiaT018','NingxiaT016','NingxiaT015','NingxiaT013','NingxiaT012','NingxiaT011','NingxiaT009','NingxiaT007','NingxiaT006','NingxiaT002','topvmetest2','tunghuaTEST','fansiTEST','if02','takotest','goldstar01','DeltaTest01','ChesterTest01','intellaHQ02','intellaHQ01','intellaHQ','topvmetest','YaLien7075','iTest4021','iTest4011','iTest3021','iTest3011','iTest2021','iTest2011','iTest1021','iTest1011','iTest402','iTest401','iTest4','UbutiTest','iTest302','iTest301','iTest3','iTest202','iTest201','iTest2','iTest102','iTest101','iTest1','iTest','nnptest83555960','No6ToastTest','shyangsoontest','dartslivetest','ImaoTest','YM83531525','iTaxiDemo','bagua01','if01','sdcoffeehq','sdcoffeeA002','sdcoffeeA001','NLTtest','iS0001','beast007p','beast005p','beast006p','purelytest','LSFCafeTest001','beast004p','beast003p','beast002p','beast001p','Xmas','Cyspera','beast1109','TTCtest','JS099902','JS099901','JS0093','JS0097','JS0096','JS0095','JS0094','JS0092','JS0091','JS0090','JS0087','JS0089','JS0088','JS0086','JS0085','JS0084','JS0083','Jinshan1GO','Jinshan2GO','Jinshan3GO','Jinshan4GO','Jinshan5GO','Jinshan6GO','Jinshan7GO','JS0082','JS0081','JS0080','JS0079','JS0078','JS0077','JS0076','JS0075','JS0074','JS0073','JS0072','JS0071','JS0070','JS0069','JS0068','JS0067','JS0065','JS0064','JS0063','JS0062','JS0061','JS0058','tw50595224','tw26767176','tw26733401','tw15779956','tw0930962408','JS0057','fannyt22897279','JS0056','JS0055','JS0054','JS0053','JS0052','JS0051','fdlife14','JS0050','JS0049','JS0048','okck0108','ab630530','JS0043','JS0042','JS0041','JS0039','b0932162899','kk23113009','JS0047','JS0046','JS0045','a0928209211','JSM031','JS0044','f0928112230','f0963572467','sanwu998','f0980418818','cschen1207','c0926957369','JSM027','JS0040','JS0038','p851025','JSM030','aa0939326355','tpjservice','a0935087283','b1044413','twboy_anthony','s7651800','candylee8088','mok17895','samkuo0521','aa24986526','0933101268','a0935211547','a24982892','mellisa24986184','is200077','chen700729','d0913179699','a0972187077','a098127751601','wade6073','a0981277516','linmu0727','f0910031279','jinshan09','jinshan08','jinshan06','jinshan05','jinshan10','jinshan04','jinshan03','jinshan02','jinshan01','csc61sr','hsu6111033','z0912417277','anthonyl198','yong33','adad57032','ahma01','mll073067','jstaroking11','lychsu57','abc0707xyz102','militarypolicer01','otome01','ymc45112','wl01402920','f0906209249','T10816','yuanta01','igcar001','yallvend001','chachathe01','topos123','ykyk0001','scsb01','s2pd010','intellavm006','wang23450538','fgspos','intellatest1','supercoffee01','wang23450515','supercar01','supergift02','superdoll','int00379','supercandy03','54390379','superegg01','supercandy01','superktv02','int50','int49','int48','int47','int46','int45','int44','int43','int42','int41','int40','int39','int38','int37','int36','int35','int34','int33','int32','int31','int30','int29','int28','int27','int26','int25','int24','int23','int22','int21','int20','int19','int18','int17','int16','int15','int14','int13','int12','int11','int10','int09','int08','int07','int06','int05','int04','int03','int02','super".replaceAll("\'","").split(",");
//        String[] s1 = "a,b,c,d,d,d".split(",");
//        String[] s2 = "b,c,c,d,e".split(",");

//        String[] s1 = usingBufferedReader("src/main/resources/txt/new1.txt").split(",");
//        String[] s2 = usingBufferedReader("src/main/resources/txt/new2.txt").split(",");


        List list1 = new ArrayList(Arrays.asList(s1));
        List hash1 = new ArrayList();                   //list1中不重複的字串
        List list2 = new ArrayList(Arrays.asList(s2));
        List hash2 = new ArrayList();                   //list2中不重複的字串

        List duplicateds1 = new ArrayList();
        List duplicateds2 = new ArrayList();


        for (String s:s1) {
            if(hash1.contains(s)){
                duplicateds1.add(s);
            }else {
                hash1.add(s);
            }
        }

        for (String s:s2) {
            if(hash2.contains(s)){
                duplicateds2.add(s);
            }else {
                hash2.add(s);
            }
        }


        System.out.println("list1: "+list1.toString().replaceAll(", " , "','").replaceAll("\\[" , "'").replaceAll("\\]" , "'"));
        System.out.println("hash1: "+hash1.toString().replaceAll(", " , "','").replaceAll("\\[" , "'").replaceAll("\\]" , "'"));
        System.out.println("list1 length: "+list1.size());


        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------");


        System.out.println("list2: "+list2.toString().replaceAll(", " , "','").replaceAll("\\[" , "'").replaceAll("\\]" , "'"));
//        System.out.println("hash2: "+hash2.toString().replaceAll(", " , "','").replaceAll("\\[" , "'").replaceAll("\\]" , "'"));
        System.out.println("list2 length: "+list2.size());


        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------");


        //list1中重複的字串
        System.out.println("list1 duplicated strings: "+duplicateds1.toString().replaceAll(", " , "','").replaceAll("\\[" , "'").replaceAll("\\]" , "'"));
        if(duplicateds1.size() > 0){
            System.out.println("list1 duplicated strings length: "+duplicateds1.size());
        }
        //list2中重複的字串
        System.out.println("list2 duplicated strings: "+duplicateds2.toString().replaceAll(", " , "','").replaceAll("\\[" , "'").replaceAll("\\]" , "'"));
        if(duplicateds1.size() > 0){
            System.out.println("list2 duplicated strings length: "+duplicateds2.size());
        }


        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------");


        List same=new ArrayList<String>(hash2);

        same.retainAll(hash1);

        Set all = new HashSet();
        all.addAll(hash1);
        all.addAll(hash2);

//        System.out.println("all: \n"+all.toString().replaceAll(", " , "','").replaceAll("\\[" , "'").replaceAll("\\]" , "'"));

//        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        List diff =new ArrayList<String>(all);
        diff.removeAll(same);

        //list1和list2中相同的字串
        System.out.println("list1 list2 same strings: \n"+same.toString().replaceAll(", " , "','").replaceAll("\\[" , "'").replaceAll("\\]" , "'"));
        System.out.println("list1 list2 same strings length: "+same.size());


        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        //list1和list2中不同的字串
        System.out.println("list1 list2 diff strings: \n"+diff.toString().replaceAll(", " , "','").replaceAll("\\[" , "'").replaceAll("\\]" , "'"));
        System.out.println("list1 list2 diff strings length: "+diff.size());
    }

    private static String usingBufferedReader(String filePath)
    {
        StringBuilder contentBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath)))
        {

            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null)
            {
                contentBuilder.append(sCurrentLine).append("\n");
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return contentBuilder.toString();
    }
}
