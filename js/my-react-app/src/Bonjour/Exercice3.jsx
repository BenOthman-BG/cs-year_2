import React, { useState } from 'react';

function Exercice3() {
  // 1. تعريف الحالة (تبدأ بنص فارغ)
  const [saisie, setSaisie] = useState("");

  // 2. دالة التعامل مع التغيير في الـ input
  const handleChange = (e) => {
    // e.target.value تعني القيمة الموجودة داخل الـ input في هذه اللحظة
    setSaisie(e.target.value);
  };

  return (
    <div style={{ textAlign: 'center', marginTop: '50px' }}>
      <h2>Exercice 3: Input contrôlé</h2>
      
      {/* 3. ربط الـ input بالـ State وبالدالة */}
      <input 
        type="text" 
        placeholder="Tapez شيء ما..." 
        value={saisie} 
        onChange={handleChange} 
      />

      {/* 4. عرض النص مباشرة أثناء الكتابة */}
      <p>Vous avez saisi : <strong>{saisie}</strong></p>
    </div>
  );
}

export default Exercice3;