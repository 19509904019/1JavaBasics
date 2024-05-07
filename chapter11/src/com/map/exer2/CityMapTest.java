package com.map.exer2;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * ClassName: CityTest
 * Package: com.map.exer2
 * Description:
 *
 * @Create 2023/10/1 19:26
 */
public class CityMapTest {
    public static void main(String[] args) {
        // 1.获取Map，并遍历map中的所有的key
        HashMap<String, Object> map = CityMap.model;
        Set<String> provinces = map.keySet();
        // 遍历打印key值
        for (String provicne : provinces) {
            System.out.println(provicne + "\t\t");
        }
        // 2.根据提示，从键盘获取省份值，判断此省份是否存在，如果存在遍历其value中的各个城市
        Scanner scan = new Scanner(System.in);
        System.out.println();
        String[] cities;
        while (true) {
            System.out.print("请输入省份：");
            String provinceName = scan.next();
            cities = (String[]) map.get(provinceName);
            if (cities == null || cities.length == 0) {
                System.out.println("输入的省份不存在，请重新输入！");
            } else {
                for (int i = 0; i < cities.length; i++) {
                    System.out.print(cities[i] + "\t\t");
                }
                break;
            }
        }
        System.out.println();
        // 3.根据提示，从键盘获取城市，遍历各个城市构成的String[]，判断输入的城市是否存在于此数组中
        // 如果存在，信息登记完毕。如果不存在，提示用户重新输入
        boolean isFalg = true;
        while (isFalg) {
            System.out.print("请选择你所在的城市：");
            String city = scan.next();

            for (int i = 0; i < cities.length; i++) {
                if (city.equals(cities[i])) {
                    System.out.println("信息登记完毕！");
                    isFalg = false;
                    break;
                }
            }

            if (isFalg) {
                System.out.println("输入城市有误，请重新输入！");
            }
        }
        scan.close();
    }

    class CityMap {
        public static HashMap<String, Object> model = new HashMap<>();

        static {
            model.put("北京", new String[]{"北京"});
            model.put("辽宁", new String[]{"沈阳", "盘锦", "铁岭", "丹东", "大连", "锦州", "营口"});
            model.put("吉林", new String[]{"长春", "延边", "吉林", "白山", "白城", "四平", "松原"});
            model.put("河北", new String[]{"承德", "沧州", "邯郸", "邢台", "唐山", "保定", "石家庄"});
            model.put("河南", new String[]{"郑州", "许昌", "开封", "洛阳", "商丘", "南阳", "新乡"});
            model.put("山东", new String[]{"济南", "青岛", "日照", "临沂", "泰安", "聊城", "德州"});
        }
    }
}
