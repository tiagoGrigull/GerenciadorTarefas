import { defineConfig } from "vite";
import react from "@vitejs/plugin-react";

// https://vitejs.dev/config/
export default defineConfig({
  plugins: [react()],
  server: {
    proxy: {
      "/luartiBack": {
        target: "http://localhost:8070",
        changeOrigin: true,
      },
    },
  },
});
