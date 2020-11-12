function outer() {
    let a = 'Hello';
    let b = {
        name: 'Patrick',
        age: 27
    }
    console.log(a + '\n' + b);

    function inner(a,b) {
        console.log(a + '\n' + b);
        a = 'Tokyo';
        b = 'Japan';
        console.log(a + '\n' + b);
    }

    inner(a, b);
    console.log(a + '\n' + b);
}
outer();