const { Builder, By, until } = require('selenium-webdriver');
const { Options } = require('selenium-webdriver/edge');

(async function example() {
    
    let driver = await new Builder()
        .forBrowser('MicrosoftEdge')
        .setEdgeOptions(new Options())
        .build();
    try {
        await driver.get('file:///D:/Учеба/git/selenium/index.html'); 

        let num1Input = await driver.findElement(By.id('num1'));
        let num2Input = await driver.findElement(By.id('num2'));
        let addButton = await driver.findElement(By.id('add'));
        let multiplyButton = await driver.findElement(By.id('multiply'));
        let divideButton = await driver.findElement(By.id('divide'));
        let resultSpan = await driver.findElement(By.id('result'));

        await num1Input.sendKeys('5');
        await num2Input.sendKeys('3');
        await addButton.click();
        await driver.sleep(1000); 
        let result = await resultSpan.getText();
        if (result === '8') {
            console.log('Тест сложения пройден успешно!');
        } else {
            console.log(`Тест сложения не пройден. Ожидалось 8, но получено ${result}`);
        }

        await num1Input.clear();
        await num2Input.clear();
        await num1Input.sendKeys('5');
        await num2Input.sendKeys('3');
        await multiplyButton.click();
        await driver.sleep(1000); 
        result = await resultSpan.getText();
        if (result === '15') {
            console.log('Тест умножения пройден успешно!');
        } else {
            console.log(`Тест умножения не пройден. Ожидалось 15, но получено ${result}`);
        }

    
        await num1Input.clear();
        await num2Input.clear();
        await num1Input.sendKeys('6');
        await num2Input.sendKeys('3');
        await divideButton.click();
        await driver.sleep(1000);
        result = await resultSpan.getText();
        if (result === '2') {
            console.log('Тест деления пройден успешно!');
        } else {
            console.log(`Тест деления не пройден. Ожидалось 2, но получено ${result}`);
        }

        
        await num1Input.clear();
        await num2Input.clear();
        await num1Input.sendKeys('5');
        await num2Input.sendKeys('0');
        await divideButton.click();
        await driver.sleep(1000); 
        result = await resultSpan.getText();
        if (result === 'Ошибка: деление на ноль') {
            console.log('Тест деления на ноль пройден успешно!');
        } else {
            console.log(`Тест деления на ноль не пройден. Ожидалось "Ошибка: деление на ноль", но получено ${result}`);
        }

    } catch (error) {
        console.error(`Произошла ошибка: ${error}`);
    } finally {
        await driver.quit();
    }
})();
