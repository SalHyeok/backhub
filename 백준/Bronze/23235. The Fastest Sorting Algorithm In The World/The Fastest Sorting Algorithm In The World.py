case_number = 1

while True:
    # 입력 받기
    N, *arr = map(int, input().split())
    
    # 종료 조건 확인
    if N == 0:
        break

    # 이미 정렬되어 있으므로 O(1)에 정렬되었다고 가정하고 출력
    print(f'Case {case_number}: Sorting... done!')
    
    case_number += 1