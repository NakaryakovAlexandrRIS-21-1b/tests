document.getElementById('add').addEventListener('click', function() {
    const num1 = parseFloat(document.getElementById('num1').value);
    const num2 = parseFloat(document.getElementById('num2').value);
    const result = num1 + num2;
    document.getElementById('result').innerText = result;
});

document.getElementById('multiply').addEventListener('click', function() {
    const num1 = parseFloat(document.getElementById('num1').value);
    const num2 = parseFloat(document.getElementById('num2').value);
    const result = num1 * num2;
    document.getElementById('result').innerText = result;
});

document.getElementById('divide').addEventListener('click', function() {
    const num1 = parseFloat(document.getElementById('num1').value);
    const num2 = parseFloat(document.getElementById('num2').value);
    if (num2 !== 0) {
        const result = num1 / num2;
        document.getElementById('result').innerText = result;
    } else {
        document.getElementById('result').innerText = 'Ошибка: деление на ноль';
    }
});
