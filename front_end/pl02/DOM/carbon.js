const pageTitle = document.getElementById("pageTitle"); 
const studentName = document.getElementById("studentName"); 
pageTitle.textContent = "Olá, turma!"; 
studentName.textContent = "Joel";

const nameForm = document.getElementById("nameForm"); 
const nameInput = document.getElementById("nameInput");
const feedbackMessage = document.getElementById("feedbackMessage");
nameForm.addEventListener("submit", function (event) {
    event.preventDefault();
    const name = nameInput.value;
    feedbackMessage.textContent = `Olá, ${name}!`;
});
const nome = nameInput.value;

const taskForm = document.getElementById("taskForm"); 
const taskInput = document.getElementById("taskInput");
const taskList = document.getElementById("taskList");
taskForm.addEventListener("submit", (event) => { event.preventDefault();
    const taskText = taskInput.value.trim();
    if (taskText === "") return;
    const taskItem = document.createElement("li"); 
    const taskLabel = document.createElement("span"); 
    taskLabel.textContent = taskText;
    const removeButton = document.createElement("button"); 
    removeButton.type = "button"; 
    removeButton.textContent = "Remover";
    removeButton.addEventListener("click", () => { taskItem.remove(); 
});
    taskItem.appendChild(taskLabel); 
    taskItem.appendChild(removeButton); 
    taskList.appendChild(taskItem); 
    taskInput.value = "";
});
