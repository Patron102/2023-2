#1
num = []
runningSum = []

for j in range(4):
    num.append(int(input("num 저장 값을 입력하시오 : ")))

for i in range(4):
    runningSum.append(sum(num[:i+1]))

print("출력값은 ", end="")
for i in range(4):
    if i == 3:
        print(runningSum[i], end="")
    else:
        print(runningSum[i], end=",")
print(" 입니다.")


#2
intList = []
max = 0

for j in range(10):
    intList.append(int(input("")))

for i in range(10):
    if intList[i] > max:
        max = intList[i]

print(max)


#3
def reverse(aa):
    aaList = list(aa)
    print(len(aaList))
    for i in range(len(aaList)):
        print(aaList[(len(aaList)-1)-i])

aa = str(input())
reverse(aa)


#4
num = int(input("num 저장 값을 입력하시오: "))
dummy = 0

if num%2 == 0:
    while True:
        num /= 2
        dummy += 1
        if num < 1:
            break

else:
    while True:
        num -= 1
        dummy += 1 
        if num == 0:
            break

print(f"출력값은 {dummy}입니다.")