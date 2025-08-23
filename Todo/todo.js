const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

const tasks = [];

function showMenu() {
    console.log('\n--- ToDoリスト ---');
    console.log('1. タスクを追加');
    console.log('2. タスクを一覧表示');
    console.log('3. タスクを完了');
    console.log('4. 終了');
    rl.question('番号を入力してください: ', handleUserInput);
}

function handleUserInput(input) {
    switch (input.trim()) {
        case '1':
            addTask();
            break;
        case '2':
            listTasks();
            break;
        case '3':
            completeTask();
            break;
        case '4':
            rl.close();
            break;
        default:
            console.log('無効な入力です。もう一度お試しください。');
            showMenu();
            break;
    }
}

function addTask() {
    rl.question('追加するタスクを入力してください: ', (task) => {
        tasks.push({ task: task, completed: false });
        console.log(`タスク「${task}」が追加されました。`);
        showMenu();
    });
}

function listTasks() {
    console.log('\n--- 現在のタスク ---');
    if (tasks.length === 0) {
        console.log('タスクはありません。');
    } else {
        tasks.forEach((item, index) => {
            const status = item.completed ? '[完了]' : '[未完了]';
            console.log(`${index + 1}. ${status} ${item.task}`);
        });
    }
    showMenu();
}

function completeTask() {
    listTasks();
    if (tasks.length === 0) {
        showMenu();
        return;
    }
    rl.question('完了したタスクの番号を入力してください: ', (index) => {
        const i = parseInt(index) - 1;
        if (i >= 0 && i < tasks.length) {
            tasks[i].completed = true;
            console.log(`タスク「${tasks[i].task}」が完了しました。`);
        } else {
            console.log('無効な番号です。');
        }
        showMenu();
    });
}

showMenu();

rl.on('close', () => {
    console.log('ToDoリストを終了します。');
    process.exit(0);
});