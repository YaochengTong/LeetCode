
// @Title: 数据流中的移动平均值 (Moving Average from Data Stream)
// @Author: tongyaocheng@gmail.com
// @Date: 2020-11-27 00:21:48
// @Runtime: 47 ms
// @Memory: 42.9 MB

class MovingAverage {
  int size, head = 0, windowSum = 0, count = 0;
  int[] queue;
  public MovingAverage(int size) {
    this.size = size;
    queue = new int[size];
  }

  public double next(int val) {
    ++count;
    // calculate the new sum by shifting the window
    int tail = (head + 1) % size;
    windowSum = windowSum - queue[tail] + val;
    // move on to the next head
    head = (head + 1) % size;
    queue[head] = val;
    return windowSum * 1.0 / Math.min(size, count);
  }
}

