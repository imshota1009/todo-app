def show_menu():
    print('\n--- ToDoリスト ---')
    print('1. タスクを追加')
    print('2. タスクを一覧表示')
    print('3. タスクを完了')
    print('4. 終了')
    choice = input('番号を入力してください: ')
    return choice

def add_task(tasks):
    task = input('追加するタスクを入力してください: ')
    tasks.append({'task': task, 'completed': False})
    print(f'タスク「{task}」が追加されました。')

def list_tasks(tasks):
    print('\n--- 現在のタスク ---')
    if not tasks:
        print('タスクはありません。')
    else:
        for i, item in enumerate(tasks):
            status = '[完了]' if item['completed'] else '[未完了]'
            print(f'{i + 1}. {status} {item["task"]}')

def complete_task(tasks):
    list_tasks(tasks)
    if not tasks:
        return
    try:
        index = int(input('完了したタスクの番号を入力してください: ')) - 1
        if 0 <= index < len(tasks):
            tasks[index]['completed'] = True
            print(f'タスク「{tasks[index]["task"]}」が完了しました。')
        else:
            print('無効な番号です。')
    except ValueError:
        print('無効な入力です。数字を入力してください。')

def main():
    tasks = []
    while True:
        choice = show_menu()
        if choice == '1':
            add_task(tasks)
        elif choice == '2':
            list_tasks(tasks)
        elif choice == '3':
            complete_task(tasks)
        elif choice == '4':
            print('ToDoリストを終了します。')
            break
        else:
            print('無効な入力です。もう一度お試しください。')

if __name__ == '__main__':
    main()