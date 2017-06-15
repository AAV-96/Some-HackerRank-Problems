//complete the code
Food food = null;
if (order.equalsIgnoreCase("cake")) {
    food = new Cake();
} else if (order.equalsIgnoreCase("pizza")) {
    food = new Pizza();
}
return food;
