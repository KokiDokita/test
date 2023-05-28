/*
* プログラミング実習1 第7回課題
*  BackwardScheduling
*   
* 提出者 22-1-211-0316 堂北　昂希
* 課題 7-3
* 提出日 2023/5/28
*/
package lesson07.park;
import java.time.temporal.ChronoUnit;
/*SchedulingStrategyクラスの実装クラスである。 */
public class BackwardScheduling implements SchedulingStrategy{
    /*引数の2つのイベント時刻と開始時刻の差を求めるメソッド */
    public long getOffset(Schedule s1,Schedule s2){
        long result = ChronoUnit.MINUTES.between(s1.getStartTime(),s2.getEndTime());//s2-s1(答えは正の数になる)
        return result;
    }
}