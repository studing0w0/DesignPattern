package duck;

import fly.FlyBehavior;
import quack.QuackBehavior;

/**
 * 전략 패턴 : 알고리즘군을 정의하고 캡슐화해 각각의 알고리즘 군을 수정해서 사용할 수 있게 해줌
 * 전략 패턴을 사용하면 알고리즘을 분리해서 독립적으로 ㅍ변경 가능
 * 슈퍼 클래스인 duck
 */

public abstract class Duck {
    /**
     *  행동 인터페이스 형식의 레퍼런스 변수 2개 선언.
     *  같은 페키지에 속하는 모든 서브클래스가 이 변수를 상속 받을 것.
     */
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(){}

    public abstract void display();


    public void performQuack(){
        quackBehavior.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }
    public void swim(){
        System.out.println("모든 오리는 물에 뜹니다. 가짜 오리도 뜨죠");
    }

    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }


}
