n = int(input())

for i in range(2, n+1):
    cnt = 0
    for j in range(2, i): # 소수 찾기(약수가 자기자신과 1인 것)
    # 2~i 사이를 j 로 나누었을 때 0이되는 것 cnt == 0 찾기
        if i % j == 0:
            cnt += 1
    # cnt == 0 인 j들은 소수이고, 이걸 출력함
    if cnt == 0:
        print(i, end=" ")