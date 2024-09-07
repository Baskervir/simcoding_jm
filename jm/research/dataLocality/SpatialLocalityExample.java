public class SpatialLocalityExample {
    public static void main(String[] args) {
        int n = 10_000_000; // 배열 크기
        int[] arr = new int[n];

        // 배열 초기화
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }

        // 배열을 순차적으로 접근하여 합산
        long startTime = System.nanoTime();
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        long endTime = System.nanoTime();

        System.out.println("순차 접근 시간: " + (endTime - startTime) / 1_000_000.0 + " ms");
    }
}