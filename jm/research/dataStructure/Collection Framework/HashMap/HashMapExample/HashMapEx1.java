import java.util.HashMap;
import java.util.Scanner;
/**
 * HashMap() : HashMap 객체를 생성
 * Object put(Object key, Object value) : 지정도니 키와 값을 HashMap 에 저장
 * boolean containsKey(Object key) : HashMap 에 지정도니 key 가 포함되어있는지 알려준다 (O : true)
 * boolean containsValue(Object value) : 지정된 value 가 포함되어있는지 알려준다 (O : true)
 * Object get(Object key) : 지정된 key 의 값(객체)을 반환 [못찾을 경우 기본값으로 지정된 객체 반환]
 * **/
public class HashMapEx1 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("myId", "1234");
        map.put("asdf", "1111");
        map.put("asdf", "1234");    // key는 고유하다 | 같은 key에 value할당 -> 초기화된다

        Scanner stdIn = new Scanner(System.in);

        while (true) {
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id : ");
            String id = stdIn.nextLine().trim();

            System.out.print("password : ");
            String password = stdIn.nextLine().trim();
            System.out.println();

            if (!map.containsKey(id)) {
                System.out.println("입력하신 id는 존재하지 않습니다." +
                        " 다시 입력해주세요.");
                continue;
            }

            if (!(map.get(id)).equals(password)) {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
            } else {
                System.out.println("id와 비밀번호가 일치합니다.");
                break;
            }
        }
    }
}
