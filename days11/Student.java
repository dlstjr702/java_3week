package days11;

public class Student {

	String name;
    int kor;
    int eng;
    int math;
    int tot;
    double avg;

    // 총점 평균 계산 함수
    public void calc() {

        tot = kor + eng + math;
        avg = tot / 3.0;
    }

    // 출력 함수
    public void disp() {

        System.out.printf(
                "이름:%s 국어:%d 영어:%d 수학:%d 총점:%d 평균:%.2f\n",
                name, kor, eng, math, tot, avg
        );
    }

}
