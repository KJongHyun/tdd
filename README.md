# TDD
TDD의 리듬 
1. 재빨리 테스트를 하나 추가한다.
2. 모든테스트를 실행하고 새로 추가한 것이 실패하는지 확인한다.
3. 코드를 조금 바꾼다.
4. 모든 테스트를 실행하고 전부 성공하는지 확인한다.
5. 리팩토링을 통해 중복을 제거한다.

## Chapter.1 다중 통화를 지원하는 Money 객체
>* $5 + 10CHF = $10(환율이 2:1일 경우)  
>* **$5 X 2 = $10**  
>* amount를 private으로 만들기  
>* Dollar 부작용(side effect)?  
>* Money 반올림?  

### 주기  
1. 작은 테스트를 하나 추가한다.  
2. 모든 테스트를 실행해서 테스트가 실패하는 것을 확인한다.  
3. 조금 수정한다.  
4. 모든 테스트를 실행해서 테스트가 성공하는 것을 확인한다.  
5. 중복을 제거하기 위해 리팩토링을 한다.  



## Chapter.2 타락한 객체
>* $5 + 10CHF = $10(환율이 2:1일 경우)  
>* ~~$5 X 2 = $10~~  
>* amount를 private으로 만들기  
>* **Dollar 부작용(side effect)?**  
>* Money 반올림?

```kotlin
fun testMultiplication() {
    val five = Dollar(5)
    five.times(2)
    assertEquals(10, five.amount)
    five.times(3)
    assertEquals(15, five.amount)
}
```
테스트 실패, five.amount는 더이상 5가 아님 테스트를 통과하기 위해서는 새로운 객체를 반환하도록 변경  
  
```kotlin
fun times(multiplier: Int): Dollar {
    return Dollar(amount * multiplier)
}
```

### Stub
Stub은 'canned answer'를 호출한 쪽에 제공한다.
'canned answer' => 정해진 질문에 대해 사전에 준비한 답  

#### Example
Order -> 결제 요청 Payment Gateway
Payment Gateway -> 결제 결과 응답 Order

Order를 격리된 단위 테스트 케이스를 작성한다고 하면 의존하는 Payment Gateway를 대체하여 미리 만들어진 응답결과(canned answer)를 반환하게 해야한다.

우리는 테스트 스텁을 Payment Gateway를 대체하기 위해 사용할 수 있다.

#### 테스트 스텁을 사용하여 얻을 수 있는 이점
* 의존하는 것에 독립적으로 개발/테스트가 가능
위 예시에서 Payment Gateway가 아직 개발 되지 않을 수 있다. 서로간의 인터페이스만 합의되면 스텁으로 대체하여 개발하고 테스트할 수있다.
* 촘촘한 테스트가 가능하다.
스텁으로 다양한 응답 결과(canned answer) 케이스(결제 성공/실패/예외)를 만들어 테스트할 수 있다.

## Chapter.3 모두를 위한 평등
>* $5 + 10CHF = $10(환율이 2:1일 경우)  
>* ~~$5 X 2 = $10~~  
>* amount를 private으로 만들기  
>* ~~Dollar 부작용(side effect)?~~  
>* Money 반올림?
## Chapter.4 프라이버시
## Chapter.5 솔직히 말하자면
## Chapter.6 돌아온 '모두를 위한 평등'
## Chapter.7 사과와 오렌지
