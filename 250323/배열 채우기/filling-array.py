arr = list(map(int, input().split()))
# arr2 선언
# 0이 아니면 append로 arr2에 추가
# 끝에서 부터 출력
arr2 = []
for i in arr:
    if i != 0:
        arr2.append(i)
    else:
        break
for i in arr2[::-1]:
    print(i, end=" ")
    