function getTotal() {
    var priceOfHouse =document.getElementById("priceOfHouse").value,
        years=document.getElementById("years").value,
        interest=document.getElementById("interest").value;

    var totalPrice, i = 0;
    for (i = 0; i < years; i++) {
        priceOfHouse=parseInt(priceOfHouse)+(priceOfHouse*interest/100);
    }

    document.getElementById("TotalPrice").value= priceOfHouse;
}