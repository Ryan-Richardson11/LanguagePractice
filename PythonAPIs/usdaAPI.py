import requests

def get_food_information(food):
    # API Key Hidden
    url = f'https://api.nal.usda.gov/fdc/v1/foods/search?api_key=jkJE59KKTValhKPYJsbSUuMFWaIPm1xvUL0LQ5C2&query={food}'
    response = requests.get(url)

    try:
        response = requests.get(url)
        response.raise_for_status()
        data = response.json()

        if 'foods' in data:
            foods_list = data['foods']
            if foods_list:

                food_item = foods_list[0]
                description = food_item.get('description', '')
                nutrients = food_item.get('foodNutrients', [])

                print(f"\nNutrition Information for {description}:")

                for nutrient in nutrients:
                    nutrient_name = nutrient.get('nutrientName', '')
                    nutrient_value = nutrient.get('value', 0)
                    unit_name = nutrient.get('unitName', '')

                    desired_nutrients = [
                        'Serving Size', 'Energy', 'Total lipid (fat)', 'Fatty acids, total saturated',
                        'Fatty acids, total trans', 'Cholesterol', 'Sodium', 'Carbohydrate, by difference',
                        'Fiber, total dietary', 'Sugars, total including NLEA', 'Sugars, added',
                        'Protein', 'Vitamin D (D2 + D3)', 'Calcium, Ca', 'Iron, Fe', 'Potassium, K'
                    ]

                    if nutrient_name in desired_nutrients:
                        print(f"{nutrient_name}: {nutrient_value} {unit_name}")

            else:
                print(f"No information found for {food}")

        else:
            print(f"No information found for {food}")

    except requests.exceptions.HTTPError as errh:
        print(f"HTTP Error: {errh}")
    except requests.exceptions.RequestException as err:
        print(f"Request Exception: {err}")

get_food_information("Bread")
get_food_information("Potato Bread")