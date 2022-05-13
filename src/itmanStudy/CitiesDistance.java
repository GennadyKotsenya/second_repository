package itmanStudy;

/*
Напишите функцию. Функция должна принимать массив городов (название и координаты).
И должна возвращать объект содержащий два города, которые находятся друг от друга на наименьшем расстоянии.

Для простоты представим, что все объекты находятся в двумерной плоскости.
 */

public class CitiesDistance {
    public static void main(String[] args) {

//        City A = new City("A",0.0, 0.0);
//        City B = new City("B",-1000000, 0.0);
//        City C = new City("C",0.0, 2000000.0);
//
//        City[] cities = {A, B, C};

        City c1 = new City("Brest",52.1, 23.68333);
        City c2 = new City("Vitebsk",55.18333, 30.16667);
        City c3 = new City("Gomel",52.44167, 31.0);
        City c4 = new City("Grodno",53.66667, 23.81667);
        City c5 = new City("Minsk",53.91667, 27.55);
        City c6 = new City("Mogilev",53.91667, 30.35);

        City[] cities = {c1, c2, c3, c4, c5, c6};

        findClosestCities(cities);

        System.out.println(Result.first.name + " and "+ Result.second.name);
    }
    public static class City{
        public String name;
        public double x;
        public double y;

        public City(String name, double x, double y) {
            this.name = name;
            this.x = x;
            this.y = y;
        }
    }

    public static class Result{
        public static City first;
        public static City second;
    }


    public static double difference(City city1, City city2){

        double result1 = city1.y - city2.y;
        double result2 = city1.x - city2.x;

        if(result1 < 0){
            result1 = -result1;
        }
        if(result2 < 0){
            result2 = -result2;
        }

        return result1 + result2;
    }

    public static Result findClosestCities(City[] cities){

        Result result = new Result();

        if(cities.length == 0){
            return null;
        }else if(cities.length == 2){
            result.first = cities[0];
            result.second = cities[1];
            return result;
        }

        double min = difference(cities[1],cities[0]);
        result.first = cities[0];
        result.second = cities[1];

        for(int i = cities.length-1; i >= 1; i--){
            for(int j = 0; j < cities.length; j++){
                if(j == i){
                    continue;
                }
                if(difference(cities[i],cities[j]) < min){
                    min = difference(cities[i],cities[j]);
                    result.first = cities[j];
                    result.second = cities[i];
                }
            }
        }
        return result;
    }
}



