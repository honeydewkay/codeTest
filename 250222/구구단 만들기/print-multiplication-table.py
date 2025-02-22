a, b = map(int, input().split())

# 조건대로 구구단을 출력
for i in range (1, 10, 1):
	for j in range(b, a - 1, -2):
		print(f"{j} * {i} = {i * j}", end="")
		if j != a:
			print(" / ", end="")
	print()
