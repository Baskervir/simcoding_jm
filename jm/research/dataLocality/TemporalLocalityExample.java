public class TemporalLocalityExample {
    public static void main(String[] args) {
        int n = 10_000; // 배열 크기
        int[] arr = new int[n];

        // 배열 초기화
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }

        // 시간 지역성을 활용하여 반복적인 접근
        long startTime = System.nanoTime();
        long sum = 0;
        for (int j = 0; j < 10; j++) { // 반복 횟수
            for (int i = 0; i < n; i++) {
                sum += arr[i];
            }
        }
        long endTime = System.nanoTime();

        System.out.println("시간 지역성 접근 시간: " + (endTime - startTime) / 1_000_000.0 + " ms");
    }
}