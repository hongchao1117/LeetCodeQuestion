package Test;

public class DDtest {
//    public class RateLimiter {
//        private int limit;
//        private ArrayBlockingQueue<Integer> blockingQueue;
//        private TimeUnit timeUnit;
//        private int period;
//
//        public RateLimiter(int limit, TimeUnit timeUnit, int period) {
//            this.limit = limit;
//            blockingQueue = new ArrayBlockingQueue<>(limit);
//            this.timeUnit = timeUnit;
//            this.period = period;
//            init();
//            start();
//        }
//
//        private void start() {
//            Executors.newScheduledThreadPool(1).scheduleAtFixedRate(this::addToken, 10, period, timeUnit);
//        }
//
//        private void addToken() {
//            blockingQueue.offer(1000);
//        }
//
//        private void init() {
//            for (int i = 0; i < limit; i++) {
//                blockingQueue.offer(1000);
//            }
//        }
//
//        public boolean tryAcquire() {
//            if (blockingQueue.peek() != null) {
//                int temp = blockingQueue.poll();
//                if (temp > 0) {
//                    temp--;
//                    return true;
//                }
//                return false;
//            } else {
//                return false;
//            }
//
//        }
//    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 1, 2, 3};
        System.out.println(search(nums));
    }

    public static int search(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] < nums[right]) {
                right = mid;
            } else if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right--;
            }
        }
        return left;
    }

}
