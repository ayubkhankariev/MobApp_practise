# Black Friday Sale App

A multilingual Android application built with **Kotlin** and **Jetpack Compose**. This project demonstrates dynamic localization, RTL (Right-to-Left) layout support, and custom UI styling without using third-party libraries for image loading.

## 📱 Features

*   **Multilingual Support**: Switch instantly between **English**, **Spanish**, and **Arabic**.
*   **Dynamic RTL Layout**: The entire UI mirrors automatically when Arabic is selected.
*   **Localized Content**: All text, prices, and currency symbols update based on the selected language.
    *   English: `$` (USD)
    *   Spanish: `€` (EUR)
    *   Arabic: `د.إ` (AED)
*   **Persistence**: The selected language is saved locally using **DataStore** and restored on app launch.
*   **Custom Design**:
    *   Custom typography using **Host Grotesk**.
    *   Custom flag icons and navigation assets.
    *   Responsive 2-column grid layout.

## 🛠 Tech Stack

*   **Language**: Kotlin
*   **UI**: Jetpack Compose (Material 3)
*   **Architecture**: MVVM (Model-View-ViewModel)
*   **Storage**: Jetpack DataStore (Preferences)
*   **Theme**: Material 3 Light Theme

## 🚀 How to Run

1.  **Clone the repository**:
    ```bash
    git clone https://github.com/ayubkhankariev/MobApp_practise.git
    ```
2.  **Open in Android Studio**:
    *   Select "Open" and navigate to the project folder.
3.  **Sync Gradle**:
    *   Allow Android Studio to download dependencies and sync the project.
4.  **Run**:
    *   Select an emulator or connected device and click the **Run** (▶️) button.

## 📂 Project Structure

*   **`model/`**: Contains data classes (`Product`, `LocalizedText`) and the `SupportedLanguage` enum.
*   **`data/`**:
    *   `ProductsRepository`: Hardcoded product data.
    *   `LanguageStorage`: DataStore implementation for saving language preferences.
    *   `PriceUtils`: Helper logic for currency conversion and formatting.
*   **`ui/`**:
    *   `SaleScreen`: The main screen composable.
    *   `MainViewModel`: Manages UI state and language switching.
    *   `theme/`: Custom colors, typography (Host Grotesk), and theme definition.
    *   `components/`: Reusable UI components like `ProductCard`.

## 📸 Screenshots

> *Note: Please run the app to see the dynamic language switching and animations in action.*

| English (LTR) | Spanish (LTR) | Arabic (RTL) |
| :---: | :---: | :---: |
| *(Place screenshot here)* | *(Place screenshot here)* | *(Place screenshot here)* |
