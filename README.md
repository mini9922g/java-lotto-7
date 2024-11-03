# java-lotto-precourse
## 로또 발매기

### 주요기능
- **당첨번호 입력**
    - 6개의 당첨 번호를 쉼표(,)로 구분하여 숫자로 입력받습니다.
    - 예외 처리 조건:
      - 1 미만 또는 45 초과의 값이 입력될 경우
      - 입력한 숫자가 6개가 아닌 경우
      - 중복된 값이 있는 경우
      - 정수가 아닌 값이 입력된 경우

- **보너스 번호 입력**
    - 1개의 보너스 번호를 입력받습니다.
    - 예외 처리 조건:
      - 1 미만 또는 45 초과의 값이 입력될 경우
      - 보너스 번호가 당첨 번호와 중복된 경우
      - 정수가 아닌 값이 입력된 경우

- **로또 구매**
    - 사용자가 입력한 금액에 따라 1000원 단위로 로또를 구매합니다.
    - 예외 처리 조건:
      - 입력 금액이 1000원으로 나누어 떨어지지 않는 경우
      - 입력 금액이 음수일 경우
      - 입력 값이 정수가 아닌 경우

- **로또 생성**
    - 1에서 45 사이의 중복되지 않는 무작위 숫자 6개로 1개의 로또를 만듭니다
    - 6개의 숫자를 오름차순으로 정렬해 저장합니다.

- **당첨 확인**
    - 구매한 로또 번호와 당첨 번호를 비교하여 당첨 내역을 확인합니다.
    - 각 등수별 당첨 개수를 출력합니다.

- **수익률 출력**
    - 로또 수익을 구매 금액으로 나누어 수익률을 구합니다.
      - ex) 구매 금액이 8,000원이고 수익이 5,000원이면, 수익률은 62.5%로 출력됩니다.
    - 전체 구매 금액 대비 당첨 금액의 수익률을 소수점 둘째 자리에서 반올림하여 출력합니다.

